package com.knoldus

import scala.io.StdIn._                     // for reading
import scala.collection.immutable.List      // for immutable list
import scala.language.postfixOps            // for postfix operator needs to be enabled

object Sorting {

  // quicksort method for sorting the list
   def quickSorting(listForSorting: List[Int]): List[Int] = {

     if (listForSorting.length <= 1){         // if list contain 0 or 1 element
       listForSorting
     }
     else {
       val pivot = listForSorting(listForSorting.length / 2)     // considering middle as pivot


       List.concat(                                          // recursively calling quickSorting method
         quickSorting(listForSorting filter (pivot >)),
         listForSorting filter (pivot ==),
         quickSorting(listForSorting filter (pivot <))
       )
     }

   }


  def main(args: Array[String]): Unit ={

    println("how many number you want to sort :")
    val num= readInt()
    println("enter the numbers :")

    try {
      //input from user
      val inputList = List.fill(num) {
        readInt()
      }

      // storing the result after sorting in output List
      val outputList =quickSorting(inputList)
      println("Output List after quick sorting : "+ outputList)

    }
    catch{
          // show exception if input is not a number
      case word: NumberFormatException => println(s"numbers only, word are not allowed !! $word")
    }

  }

}
