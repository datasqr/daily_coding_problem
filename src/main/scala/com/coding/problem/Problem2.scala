package com.coding.problem

import scala.collection.mutable.ArrayBuffer

object Problem2 extends App {

  val input = List(3,2,1)
  val output = ArrayBuffer[Int]()

  for(i <- 0 to input.size-1){
    val tempList = input.patch(i, Nil, 1)
    val productList = tempList.reduceLeft(_ * _)
    output += productList
  }
  println(output)


}
