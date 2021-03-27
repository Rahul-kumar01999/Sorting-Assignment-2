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
// scalastyle:off magic.number
import org.scalatest.flatspec.AnyFlatSpec

class SortingTest extends AnyFlatSpec {

  val sorting= new Sorting

  "QuickSorting" should "return correct sorted List positive numbers" in{
    assert(sorting.quickSorting(List(56,2,23,5,1,15))== List(1,2,5,15,23,56))
  }

  it should "return correct sorted List of negative numbers" in{
    assert(sorting.quickSorting(List(-56,-2,-23,-5,-1,-15))== List(-56,-23,-15,-5,-2,-1))
  }

  it should "return correct sorted List of negative and positive numbers" in{
    assert(sorting.quickSorting(List(-56,2,-23,-5,1,15))== List(-56,-23,-5,1,2,15))
  }

  it should "return empty list" in{
    assert(sorting.quickSorting(List())== List())
  }
}
