package io.continuum.bokeh
package examples
package models

import math.{Pi=>pi,sin,cos}
import sampledata.webbrowsers.{webbrowsers_nov_2013,WebBrowserIcons}

object Donut extends Example {
    val xdr = new Range1d().start(-2).end(2)
    val ydr = new Range1d().start(-2).end(2)

    val title = "Web browser market share (November 2013)"
    val plot = new Plot().title(title).x_range(xdr).y_range(ydr).plot_width(800).plot_height(800)

    val browser_colors = Map(
        "Chrome"  -> Color.SeaGreen,
        "Firefox" -> Color.Tomato,
        "Safari"  -> Color.Orchid,
        "Opera"   -> Color.FireBrick,
        "IE"      -> Color.SkyBlue,
        "Other"   -> Color.LightGray)

    val browser_icons = Map(
        "Chrome"  -> WebBrowserIcons.Chrome,
        "Firefox" -> WebBrowserIcons.Firefox,
        "Safari"  -> WebBrowserIcons.Safari,
        "Opera"   -> WebBrowserIcons.Opera,
        "IE"      -> WebBrowserIcons.IE,
        "Other"   -> "")

    case class WebBrowserData(browser: String, version: String, share: Double)

    val df = webbrowsers_nov_2013
    val data = (df.browser, df.version, df.share).zipped.map {
        case (browser, version, share) => WebBrowserData(browser, version, share)
    }

    val aggregated = data.groupBy(_.browser).mapValues(_.map(_.share).sum)

    def agg(fn: Double => Boolean) = aggregated.filter { case (_, share) => fn(share) }
    val chosen = agg(_ >= 1) + ("Other" -> agg(_ < 1).values.sum)

    val browsers = chosen.keys
    val angles = chosen.values.map(2*pi*_/100).scanLeft(0.0)(_ + _)

    val start_angles = angles.init.toList
    val end_angles = angles.tail.toList

    object browsers_source extends ColumnDataSource {
        val start  = column(start_angles)
        val end    = column(end_angles)
        val colors = column(browsers.map(browser_colors))
    }

    val glyph = Wedge().x(0).y(0).radius(1).line_color(Color.White).line_width(2).start_angle('start).end_angle('end).fill_color('colors)
    plot.addGlyph(browsers_source, glyph)

    def polar_to_cartesian(r: Double, start_angles: Seq[Double], end_angles: Seq[Double]): (Seq[Double], Seq[Double]) = {
        start_angles.zip(end_angles)
                    .map { case (start, end) => (end + start)/2 }
                    .map { angle => (r*cos(angle), r*sin(angle)) }
                    .unzip
    }

    for {
        browser     <- browsers
        start_angle <- start_angles
        end_angle   <- end_angles
    } {
        /*
        val versions = data.filter(_.browser == browser).filter(_.share >= 0.5).map(_.version)
        val angles = versions.Share.map(radians).cumsum() + start_angle
        val end = angles.tolist() + [end_angle]
        val start = [start_angle] + end[:-1]
        val base_color = browser_colors[browser]
        val fill = [ base_color.lighten(i*0.05) for i in range(len(versions) + 1) ]
        val text = [ number if share >= 1 else "" for number, share in zip(versions.VersionNumber, versions.Share) ]
        val (x, y) = polar_to_cartesian(1.25, start, end)

        {
            val source = new ColumnDataSource().data(Map('start -> start, 'end -> end, 'fill -> fill))
            val glyph = AnnularWedge().x(0).y(0).inner_radius(1).outer_radius(1.5).start_angle('start).end_angle('end).line_color(Color.White).line_width(2).fill_color('fill)
            plot.addGlyph(source, glyph)
        }

        val text_angle = [(start[i] + end[i])/2 for i in range(len(start))]
        val text_angle = [angle + pi if pi/2 < angle < 3*pi/2 else angle for angle in text_angle]

        {
            val source = new ColumnDataSource().data(Map('text -> text, 'x -> x, 'y -> y, 'angle -> text_angle))
            val glyph = Text().x('x).y('y).text('text).angle('angle).text_align(TextAlign.Center).text_baseline(TextBaseline.Middle)
            plot.addGlyph(source, glyph)
        }
        */
    }

    {
        val (_x, _y) = polar_to_cartesian(1.7, start_angles, end_angles)
        val source = new ColumnDataSource {
            val x    = column(_x)
            val y    = column(_y)
            val urls = column(browsers.map(browser_icons))
        }
        val glyph = ImageURL().url('urls).x('x).y('y).angle(0.0).anchor(Anchor.Center)
        plot.addGlyph(source, glyph)
    }

    {
        val (_x, _y) = polar_to_cartesian(0.7, start_angles, end_angles)
        val source = new ColumnDataSource {
            val x    = column(_x)
            val y    = column(_y)
            val text = column(chosen.values.map(share => f"$share%.02f%%"))
        }
        val glyph = Text().x('x).y('y).text('text).angle(0).text_align(TextAlign.Center).text_baseline(TextBaseline.Middle)
        plot.addGlyph(source, glyph)
    }

    val document = new Document(plot)
    val html = document.save("donut.html", config.resources)
    info(s"Wrote ${html.file}. Open ${html.url} in a web browser.")
}
