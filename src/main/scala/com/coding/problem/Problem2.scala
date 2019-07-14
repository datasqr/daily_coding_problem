package com.coding.problem

import scala.collection.mutable.ArrayBuffer

/**
  * 
  * This problem was asked by Uber.
  *
  * Given an array of integers, return a new array such that
  * each element at index i of the new array is the product
  * of all the numbers in the original array except the one at i.
  *
  * For example, if our input was [1, 2, 3, 4, 5], the expected
  * output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1],
  * the expected output would be [2, 3, 6].
  *
  */

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
