package com.bluesoft.exercise

abstract class MyOwnList {

  class Node {
    var data: Int = 0
    var next: Node = null
  }

  def getHead: Node

  def getTail: Node

  def isEmpty: Boolean

  def add(n: Int)

  def toString: String
}

class Node {
  var data: Int = 0
  var next: Node = null
}

class LinkedList extends MyOwnList {
  var head: Node = null

  def add(data: Int) = {
    val node: Node = new Node

     node.data = data
     node.next = null

    if(head == null){
      head = node
    }else{
      var n:Node = head
      while (n.next != null){
        n = n.next
      }
      n.next = node
    }
  }

  def show() = {
    var node: Node = head

    while (node.next != null){
      println(s"[ ${node.data} ]")
      node = node.next
    }
    println(s"[ ${node.data} ]")
  }

  override def getTail : Node = {
    var node: Node = head
    if(node != null){
      while (node.next != null){}
      return node
    }
    return null
  }

  override def isEmpty: Boolean = {
     return head == null
  }

  override def getHead: Node = return head

  override def toString: String = {
    var node: Node = getHead
    var str: String = ""

    while (node.next != null){
      str += s"< ${node.data} >"
      node = node.next
    }
    str += s"< ${node.data} >"
    return str
  }
}

object Runner extends App {

  val linked = new LinkedList()

  linked.add(10)
  linked.add(12)
  linked.add(14)
  linked.add(16)

  linked.show()

  println(linked.toString)



}

