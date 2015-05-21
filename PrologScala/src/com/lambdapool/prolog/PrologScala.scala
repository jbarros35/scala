package com.lambdapool.prolog

import alice.tuprolog._
/**
 * Created by jose on 11/27/2014.
 */
object PrologScala {

  def main(args: Array[String]) {
    val engine = new Prolog()
    val theory = new Theory("cat(tom).")
    engine.setTheory(theory)
    val info = engine.solve("cat(X).")
    val term = info.getSolution()
    println(term)
  }
}
