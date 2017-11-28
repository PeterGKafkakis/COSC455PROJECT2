// COSC 455 - Programming Languages: Implementation and Design
// Project 2
// NAME: Peter Kafkakis
// COMPLETED 
def prime(num : Int): Boolean = !((2 until num - 1) exists (num % _ == 0))

/* Test Cases for prime function */
prime (149)
prime(6)
prime(9)
prime(7)

/* TwinPrimes Function */
def twinPrimes(num1: Int, num2: Int): Boolean =
{
 if (prime(num1) && prime(num2))
   {
     if (num1 - num2 == 2 || num2 - num1 == 2)
       {
        return true
       }
   }
   false
}
/* Test Cases for twinPrimes function */
twinPrimes(5,7)
twinPrimes(6,9)
twinPrimes(41,43)
twinPrimes(43,47)

/* TwinPrimesList Function */

def twinPrimesList(n : Int): List[Int] =
{
n match
  {
    /*  Nil Marks END of list  */
  case x if x <= 2 => Nil
  case x =>
    if (twinPrimes(x+2, x) || twinPrimes(x-2, x))
    {
      /* Using recursion to add to list */
      x :: twinPrimesList(x - 1)
    }
    else
      {
        /* If N doesnt pass the if statement, else keep using recursion
        until if statement becomes true to add a new twinprime */
        twinPrimesList(x - 1)
      }
}
}
/* In order from 3 to N */
twinPrimesList(50).reverse
/* In order from N to 3 */
twinPrimesList(50)

def checkEven(n : Int): Boolean =
{
  if (n % 2 == 0)
    {
      return true
    }
  false
}

/* Creating a prime list function in order to have a list of ALL primes, not just
twin primes
 */
def makePrimeList(n: Int): List[Int] =
{
  n match {
    case x if x <= 2 => Nil
    case x => if (prime(x)) {
      x :: makePrimeList(x - 1)
    }
    else {
      makePrimeList(x - 1)
    }
  }
}

/* Calling makePrimeList */
makePrimeList(40).reverse

var a = makePrimeList(20)


def goldBach(n : Int, primesList:List[Int]): List[(Int, Int)] =
{
n match
{
  case x if x <= 2 => List((0,0))
  case x if checkEven(x) => for { x <- primesList; y <- primesList; if x+y == n } yield (x,y)
}
}

// Passing in integer that we want to perform GoldBach Conjecture on.
// Second Parameter is a list which is created with the makePrimeList Method
goldBach(24, a)

