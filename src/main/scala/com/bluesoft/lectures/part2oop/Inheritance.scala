package com.bluesoft.lectures.part2oop

object Inheritance extends App {

  sealed class Animal{
    val creatureType = "wild"
    def eat = println("nom")
  }

  class Cat extends Animal{
      def crunch = {
        eat
        println("crunch")
      }
  }

  val cat = new Cat

  cat.crunch


  class Person(name: String, age: Int){
    def this(name: String) = this(name,0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog extends Animal{
    override val creatureType: String = "domestic"
    override def eat = {
      super.eat
      println("crunch crunch")
    }
  }

  val dog = new Dog

  dog.eat

  // type substitution (polymorphism)
  val unknownAnimal: Animal = new Dog
  unknownAnimal.eat

}
