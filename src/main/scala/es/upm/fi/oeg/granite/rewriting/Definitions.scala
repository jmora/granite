package es.upm.fi.oeg.granite.rewriting

abstract class Term
abstract class Node

case class Constant(value:String) extends Term 
case class Variable(name:String) extends Term 
case class Function(name:String, terms:Seq[Term]) extends Term 
case class Atom(predicate:Term, terms:Seq[Term]) extends Node
case class HornClause(head:Atom, body:Seq[Node])
case class LogicProgram(special:Seq[Atom], body:Seq[HornClause]) extends Node

