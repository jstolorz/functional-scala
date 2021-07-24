package com.bluesoft.lectures.part1basic

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFac(n: Int, acc: Int = 1): Int = {
    if(n <= 1) acc
    else trFac(n-1,n*acc)
  }

  val fact10 = trFac(10)

  println(fact10)


}
