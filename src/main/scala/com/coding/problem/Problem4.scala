package com.coding.problem

/**
  *
  * Given an array of integers, find the first missing positive integer in linear time and constant space.
  * In other words, find the lowest positive integer that does not exist in the array.
  * The array can contain duplicates and negative numbers as well.
  *
  * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
  *
  *
  *
  */

object Problem4 extends App {

  val listInit = List(1, 2, 0) //List(3, 4, -1, 1)

  val list2 = listInit
    .filter(x => x > 0)

  var minVal = list2.min

  var runC = true
  var i  = 0
  while(runC) {

    val list3 = list2
        .map(x => x < minVal)


    println(minVal)
    println(list3)
    println(runC)

    if(list3.contains(true) && !list2.contains(minVal)){
      runC = false
    }

    minVal = minVal + 1

    Thread.sleep(1000L)

  }

  print(minVal-1)

}
