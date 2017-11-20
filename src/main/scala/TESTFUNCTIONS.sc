/* Peter Kafkakis COSC 455 PROJECT 2 */

/* Prime Function */
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
    /* Empty List */
  case x if x <= 2 => Nil
  case n =>
    if (twinPrimes(n+2, n) || twinPrimes(n-2, n))
    {
      /* Using recursion to add to list */
      n :: twinPrimesList(n - 1)
    }
    else
      {
        /* If N doesnt pass the if statement, else keep using recursion
        until if statement becomes true to add a new twinprime */
        twinPrimesList(n - 1)
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


def goldBach(n : Int): Unit =
{
  var myList : List[Int] = twinPrimesList(n)
  myList = myList.reverse

n match
{
  case x if x <= 2 => println("Integer Parameter should be greater than 2")
  case n =>
     if (checkEven(n))
       {
         myList.contains(n)
       }

}



}




