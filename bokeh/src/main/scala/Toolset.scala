package io.continuum.bokeh

trait Toolset { toolset =>
    protected val tools: List[DefaultTool]
    def |(other: DefaultTool) = new Toolset { val tools = toolset.tools :+ other }
    def toList: List[Tool] = tools.map(_.tool)
}

sealed abstract class DefaultTool extends Toolset {
    protected val tools = this :: Nil
    def tool: Tool
}

trait Tools {
    case object Pan         extends DefaultTool { def tool = new PanTool()         }
    case object WheelZoom   extends DefaultTool { def tool = new WheelZoomTool()   }
    case object PreviewSave extends DefaultTool { def tool = new PreviewSaveTool() }
    case object Undo        extends DefaultTool { def tool = new UndoTool()        }
    case object Redo        extends DefaultTool { def tool = new RedoTool()        }
    case object Reset       extends DefaultTool { def tool = new ResetTool()       }
    case object Resize      extends DefaultTool { def tool = new ResizeTool()      }
    case object Crosshair   extends DefaultTool { def tool = new CrosshairTool()   }
    case object BoxZoom     extends DefaultTool { def tool = new BoxZoomTool()     }
    case object BoxSelect   extends DefaultTool { def tool = new BoxSelectTool()   }
    case object LassoSelect extends DefaultTool { def tool = new LassoSelectTool() }
    case object PolySelect  extends DefaultTool { def tool = new PolySelectTool()  }
    case object Tap         extends DefaultTool { def tool = new TapTool()         }
    case object Hover       extends DefaultTool { def tool = new HoverTool()       }
    case object Help        extends DefaultTool { def tool = new HelpTool()        }

    implicit def ToolsetToList(tools: Toolset): List[Tool] = tools.toList
}

object Tools extends Tools
