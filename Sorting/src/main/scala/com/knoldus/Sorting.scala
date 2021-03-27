// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.knoldus

import scala.collection.immutable.List      // for immutable list
import scala.language.postfixOps             // for postfix operator needs to be enabled

class Sorting {

  // quicksort method for sorting the list
  def quickSorting(listForSorting: List[Int]): List[Int] = {

    if (listForSorting.length <= 1) { // if list contain 0 or 1 element
      listForSorting
    }
    else {
      val pivot = listForSorting(listForSorting.length / 2) // considering middle as pivot


      List.concat( // recursively calling quickSorting method
        quickSorting(listForSorting filter (pivot >)),
        listForSorting filter (pivot ==),
        quickSorting(listForSorting filter (pivot <))
      )
    }
  }
}
