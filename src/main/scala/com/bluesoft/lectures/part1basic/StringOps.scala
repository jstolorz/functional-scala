package com.bluesoft.lectures.part1basic

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "23"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')

  println(str.reverse)
  println(str.take(2))

  // Scala specific: String interpolators.

  // S-interpolators
  val name = "Janusz"
  val age = 52
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old"

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f"

  println(myth)

  // row-interpolators

  println(raw"Tis is a \n newline")

}
