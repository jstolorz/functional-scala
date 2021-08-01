package com.bluesoft.lectures.part2oop

object AbstractDataType  extends App {

  // abstract
  abstract class Animal{
    val creatureType: String;
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "domestic"

    override def eat: Unit = println("crunch")
  }

  // traits

  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = ""


    override def eat: Unit = println("animal")

    override def eat(animal: Animal): Unit = println("carnivore")
  }

  // traits vs abstract
  // 1. trait do not have constructor parameters
  // 2. multiple trait
  // 3. trait behavior, class thing



}
