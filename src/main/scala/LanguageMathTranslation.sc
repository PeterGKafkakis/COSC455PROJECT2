// COSC 455 - Programming Languages: Implementation and Design
// Project 2
// NAME: Peter Kafkakis


val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
val languageList: List[String] = chinese ::: english

// Given Test Cases
var test1 : List[String] = List("yi","nine","six","ba")
var test2: List[String] = List("yi","josh","three","si")
// Extra Test List with 2 merged lists
var test3: List[String] = test1 ::: test2
println(test3)

// My Test Case with multiple strings that should be discarded from list
var test4: List[String] = List("Johnnnnny", "Apple", "joll", "yi", "nine")


// Testing mkString method
test4.mkString("+")
println(test4)

// Query Function "Go"
def go(list : List[String]) : Unit = {
  list match
    {
    case Nil => println("Nothing To Do")
    case testList => val myList = convertToNumber(FilterOutElements(testList))
      println("Translation " + myList)
      println("Addition " + myList.mkString("+") + " = " + addition(myList) + "\n")
      println("Multiplication " + myList.mkString("*") + " = " + multiply(myList))
  }
}

// Function checks to see if the specified elements are in the list
def myMember(element: String, aList: List[String]): Boolean =
  aList match {
    case Nil => false
    case listHead::listTail => if (element == listHead) true else myMember(element, listTail)
  }

// Using myMember function, this function will discard strings not part of the English/Chinese Language
def FilterOutElements(list : List[String]) = list.filter(word => myMember(word, languageList))

// Multiply Function multiplies numbers in list from left to right
def multiply(list : List[Int]) : Int = {list.foldLeft(1)(_ * _)}

// Addition Function adds numbers in list from left to right
def addition(list : List[Int]) : Int = {list.foldLeft(0)(_ + _)}



// Function will convert Chinese / English Language to Integers by index
def convertToNumber(list : List[String]): List[Int] = {
list match
  {
  case Nil => Nil
  case listHead::listTail =>
    if (english.contains(listHead)) {
    english.indexOf(listHead) :: convertToNumber(listTail)
  } else {
    chinese.indexOf(listHead) :: convertToNumber(listTail)
  }
}
}

// Testing Functions
addition(convertToNumber(FilterOutElements(test3)))


go(test1)
go(test2)
go(test3)
go(test4)














