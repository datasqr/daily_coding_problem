package com.coding.problem

/**
  * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
  * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
  */

object Problem1 extends App {
  val listOfNumbers = List(31,221,1,2,76,34,13,79,69,10)
  val k = 79
  var start = true
  var i = 0
  var j = 1
  while(start){
    val temp = listOfNumbers(i) + listOfNumbers(j)
    println(temp)
    println(temp == k)
    j = j + 1
    if(j > listOfNumbers.size-1){
      i = i + 1
      j = i + 1
      if(i > listOfNumbers.size-2) start = false
      //if(temp == k) start = false
    }
  }
}
