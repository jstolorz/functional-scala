package com.bluesoft.lectures.part1basic

object Expressions extends App {

  val x = 1 + 4

  println(x)

  println(2 + 3 * 4)

  // Instructions (DO) vs Expressions (VALUES)

  // IF expression

  val aCondition = true

  val aConditionedValue = if(aCondition) 5 else 3

  println(aConditionedValue)

  // while NEVER WRITE THIS AGAIN !

  var i = 0
  val aWhile = while(i < 10){
    println(i)
    i += 1
  }

  println(aWhile)

  // EVERYTHING IN SCALA IS AN EXPRESSION!

  // Code Block

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if(z>2) "hello" else "goodbye"
  }

  println(aCodeBlock)

  val sameValue = {
    2 < 3
  }

  println(sameValue)

}
