package com.bluesoft.lectures.part1basic

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello",12))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
     if(n == 1) aString
     else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Janusz_",10))

  def aFunctionWithSideEffect(aString: String): Unit = println(aString)

  aFunctionWithSideEffect("olo")

  def aParentFunction(n: Int): Int = {
    def aChildFunction(a: Int, b: Int): Int = a + b
    aChildFunction(n,n-1)
  }

  val result = aParentFunction(12)

  println(result)

  def greetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(greetingFunction("janusz",52))

  def functorialFunction(n: Int): Int = {
    if(n <= 0) 1
    else
    n * functorialFunction(n - 1)

  }

  println(functorialFunction(8))

  def fibonacciFunction(n: Int): Int =
    if (n <= 2) 1
    else
      fibonacciFunction(n - 1) + functorialFunction(n - 2)

  println(fibonacciFunction(8))







}
