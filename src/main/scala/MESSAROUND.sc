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






