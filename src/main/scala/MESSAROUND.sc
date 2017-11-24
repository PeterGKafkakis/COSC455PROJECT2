// Val is basically a final variable, immutable
// Var mutable, can be changed


val Pie = 900
println(Pie)

// Some practice functions


// square function

def square(x: Double) = x * x
square(2)


println(
  {
    var x = 5
    if (x > 3)
    {
      x
    }
  }
)

/* ::: List Concentation */

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")


// :: pronounced "Cons" */

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)


val list = 1 :: 2 :: 3 :: Nil
println(list)

// Two ways to create a list


var l = List(3.0, 5, 'a')
var l2 = 1::2::3::4::5::'a'::Nil
var l3 = List.range(10,20)
var l4 = l:::l2

var sum = 0
l3.foreach(sum += _)
println(sum)
val listTest = List((1,2),(3,4),(5,6))

for((a,b)<-listTest) yield a+b

var practice = List(1,2,3,4,5,6,7,8,9,10)

sum = 0
practice.foreach(sum += _)

List(1,2,4.5)
List(1,true)
List(1,true,"Peter")


def addOne(x:Int) = x + 1
addOne(7)

def function1(x:Int) = if(x>0)x else "Negative"

function1(9)


var b  = 10.to(20)



def abs (x: Int) = if ( x < 0) -x else x
abs(-5)



def fac(x : Int): Int = if(x <= 0) 1 else x * fac(x-1)

fac(5)


def printName (firstName : String, lastName : String): Unit =
{
  println(firstName + " " + lastName)
}

printName("Peter", "Kafkakis")



def sum(args:Int*) = {
  var result = 0

  for(arg <- args) result += arg
  result

}

sum(1,2,3,4,5)

// Higher - Order Functions

 val double = (i : Int) => i * 2
def higherOrder(x:Int, y:Int => Int) = y(x)

higherOrder(6, double)

val triple = (i:Int) => i * 3
higherOrder(8,triple)


def sayHello = (name:String) => {"Hello" + " " + name}
sayHello("Peter")


var multiplier = (x:Int) => x * y
multiplier(6)

var x = 3
var y = 6

var sumNow = x + y
var b1 = x&y
var b2 = x|y
var b3 = x^y

val nums = 1::3::5::7::Nil

if ( x > 0 || y > 0) " Both are positive"












