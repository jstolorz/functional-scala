package com.bluesoft.lectures.part2oop

object Generics extends App {

  class MyList[+A] {

   // not possible ! -> def add[element: A]: MyList[A] = ???
   def add[B >: A](element: B): MyList[B] = ???


  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOFString = new MyList[String]

  object MyList {
    //def empty[A]: MyList[A] = ???
  }

  //val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal

  class Cat extends Animal

  class Dog extends Animal

  // yes List[Cat] extends List[Animal] == Covariance +A

  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // no animalList.add(new Dog) ??? Hard Question (invariance) we return list of animals


  // Invariance list A
  class InvarianceList[A]
  // no invarianceAnimalList: InvarianceList[Animal] = new InvarianceList[Cat] !!!!

  // Contravariance -A
  class ContravarianceList[-A]
  val contravariantList: ContravarianceList[Cat] = new ContravarianceList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types <:
  class Cage[A <: Animal](animal: A)  // only class which are subtypes of animal

  val cage = new Cage(new Dog)




  // unbounded types  >:
  class Ex[A >: Animal] // only superclass of Animal







}
