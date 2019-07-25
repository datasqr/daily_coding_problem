package com.coding.problem

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
