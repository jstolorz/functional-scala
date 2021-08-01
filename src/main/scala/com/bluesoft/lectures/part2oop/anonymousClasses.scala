package com.bluesoft.lectures.part2oop

object AnonymousClasses extends App {

  trait Animal {
    def eat: Unit
  }

  val fannyAnimal: Animal = new Animal {
    override def eat: Unit = ???
  }

//  equivalent with :
//  class AnonymousClasses$$anon$1 extends Animal{
//    override def eat: Unit = ???
//  }

   class Person(name: String){
     def sayHe: Unit = println(s"Hi, my nme is ${name}, how can I help ?")
   }

  val olo = new Person("olo"){
      override def sayHe: Unit = println(s"Hi, my nme is olo, how can I help ?")
  }

}
