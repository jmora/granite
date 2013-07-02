package es.upm.fi.oeg.granite.rewriting

trait prettyPrintable {
  def print():String
  def sep (c:Iterable[prettyPrintable], s:String = ", ") = c.map(_.print).mkString(s)
}

abstract class Term extends prettyPrintable

case class Constant(value:String) extends Term {
  def print() = value
}

case class Variable(name:String) extends Term {
  def print() = s"?$name"
}

case class Function(name:String, terms:Seq[Term]) extends Term {
  def print() = s"$name(${sep(terms)})"
}

case class Atom(predicate:Term, terms:Seq[Term]) extends prettyPrintable {
  def print() = s"${predicate.print}(${sep(terms)})"
}

case class HornClause(head:Atom, body:Seq[Atom]) extends prettyPrintable {
  def print() = s"${head.print} <- ${sep(body)}"
}

case class LogicProgram(special:Seq[Atom], body:Seq[HornClause]) extends prettyPrintable {
  def print() = s"${sep(body, "\n")}\nQuerying: ${sep(special)}\n"
}

