package es.upm.fi.oeg.granite.rewriting

import com.hp.hpl.jena.query.Query
import com.hp.hpl.jena.sparql.algebra.Algebra
import com.hp.hpl.jena.sparql.algebra.Op
import com.hp.hpl.jena.sparql.algebra.op._

class Rewriter {
  
  def rewrite(sparqlQuery:Query): Query = {
    processOp(Algebra.compile(sparqlQuery), Seq())
    
    sparqlQuery 
  }
  
  def processOp (op:Op, distinguished:Seq[String]) = {
    op match  {
		case op:OpBGP => 
		case op:Op0 => 
		case op:Op1 =>
		case op:Op2 => 
		/*case op:OpAssign =>
		case op:OpBase =>
		case op:OpConditional =>
		case op:OpDatasetNames =>
		case op:OpDiff =>
		case op:OpDisjunction =>
		case op:OpDistinct =>
		case op:OpExt =>
		case op:OpExtend =>
		case op:OpFilter =>
		case op:OpGraph =>
		case op:OpGroup =>
		case op:OpJoin =>
		case op:OpLabel =>
		case op:OpLeftJoin =>
		case op:OpList =>
		case op:OpMinus =>
		case op:OpModifier =>
		case op:OpN =>
		case op:OpNull =>
		case op:OpOrder =>
		case op:OpPath =>
		case op:OpProcedure =>
		case op:OpProject =>
		case op:OpPropFunc =>
		case op:OpQuadPattern =>
		case op:OpReduced =>
		case op:OpSequence =>
		case op:OpService =>
		case op:OpSlice =>
		case op:OpTable =>
		case op:OpTopN =>
		case op:OpTriple =>
		case op:OpUnion =>*/
    }
  }

}