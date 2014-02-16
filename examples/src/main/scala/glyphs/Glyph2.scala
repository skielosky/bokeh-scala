package org.continuumio.bokeh.examples

import org.continuumio.bokeh._
import breeze.linalg.DenseVector
import breeze.numerics.{sin,cos}
import math.{Pi=>pi}

object Glyph2 extends App {
    val x = DenseVector(-2*pi to 2*pi by 0.1 toArray)
    val y = sin(x)
    val r = (cos(x) + 1.0)*6.0 + 6.0

    val source = new ColumnDataSource().data(Map('x -> x, 'y -> y, 'r -> r))

    val xdr = new DataRange1d().sources(source.columns('x) :: Nil)
    val ydr = new DataRange1d().sources(source.columns('y) :: Nil)

    val circle = new Circle()
        .x('x)
        .y('y)
        .radius('r, Units.Screen)
        .fill_color(Color.Red)
        .line_color(Color.Black)

    val glyph_renderer = new Glyph()
        .data_source(source)
        .xdata_range(xdr)
        .ydata_range(ydr)
        .glyph(circle)

    val plot = new Plot().x_range(xdr).y_range(ydr).data_sources(source :: Nil).title("glyph2")

    val pantool = new PanTool().plot(plot)
    val wheelzoomtool = new WheelZoomTool().plot(plot)

    val xaxis = new LinearAxis().plot(plot).dimension(0).location(Location.Min)
    val yaxis = new LinearAxis().plot(plot).dimension(1).location(Location.Min)

    val xgrid = new Grid().plot(plot).dimension(0)
    val ygrid = new Grid().plot(plot).dimension(1)

    plot.renderers := List(xaxis, yaxis, xgrid, ygrid, glyph_renderer)
    plot.tools := List(pantool, wheelzoomtool)

    val session = new HTMLFileSession("glyph2.html")
    session.save(plot)
    println(s"Wrote ${session.file}. Open ${session.url} in a web browser.")
}