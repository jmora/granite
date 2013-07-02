package es.upm.fi.oeg.granite.rewriting


object Conversions {
  val specialFunctions = Seq(">", "<", "=", "==", ">=", "<=", "!=")
  val reverseFunctions = Map(">" -> "<", ">=" -> "=<")
  val specialPredicates = Seq("filter", "order")
  
  def fromSPARQL(SPARQLString:String):LogicProgram = {
    LogicProgram(Seq(),Seq())
  }
  
  def toSPARQL(program:LogicProgram):String = {
    ""
  }
  
  def fromDatalog(DatalogString:String):LogicProgram = {
    LogicProgram(Seq(),Seq())
  }
  
  def toDatalog(program:LogicProgram):String = {
    ""
  }
  
  def combine(base:LogicProgram, update:LogicProgram):LogicProgram = {
    LogicProgram(Seq(),Seq())
  }
  
}

