package com.bluesoft.lectures.part1basic

import scala.annotation.tailrec

object Recursion extends App {

  // Not smart factorial

  def functional(n: Int): Int =
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * functional(n-1)
      println("Computed factorial of " + n)
      result
    }

  //println(functional(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x-1,x * accumulator)   // TAIL RECURSION = use recursive call as the LAST expresion

    factHelper(n,1)
  }

  println(anotherFactorial(100))

  @tailrec
  def concatenateStringN(n: Int, str: String, accu: String): String = {
    if(n <= 0) accu
     else concatenateStringN(n - 1, str, accu + str)
  }

  println(concatenateStringN(10,"Janusz_",""))

  def isPrime(n: Int): Boolean = {
      @tailrec
      def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
          if(!isStillPrime) false
          else if(t<=1) true
          else {
            println(t)
            println(t%(t-1) != 0 && isStillPrime)
            isPrimeTailrec(t-1,n % t != 0 && isStillPrime)
          }
      }

      isPrimeTailrec(n/2,true)
  }

  println(isPrime(7))





}
