

def add(x:Int, y:Int):Int = {
    return x + y
}

def addabbr(x:Int, y:Int) = x + y

def myconcat(s:String, y:Int) = s + y

def badadd(x:Int, y:Int) {
    x + y
} 

println(myconcat("Foo", 10)) //Foo10

def anotherconcat(s:String, y:Int) = println(s + y)

println(badadd(4, 10))


def foo(x:Int) = {
   if (x > 5) 5
   else "Less than 5"
}

import scala.annotation.tailrec

//@tailrec
def factBad(x:Int):Int = { if ((x == 0) || (x == 1)) 1
    else x * factBad(x - 1) //non tail call
}


def factorial(x:Int) = {

  @tailrec
  def factNew(x:BigInt, total:BigInt):BigInt = {
       if ((x == 0) || (x == 1)) total
       else factNew(x-1, total * x) //efficient, tail call
   }
   factNew(x, 1)
}

//println(factorial(5))
//println(factorial(100000))

def whoIsThere_?(x:Int) = x + 1
def `quoth the raven...`(x:String) = x + " nevermore"

println(`quoth the raven...`("Hey man"))

class Foo(x:Int) {
   def ~:(y:Int) = x + y
}

val foo = new Foo(10)
println(foo.~:(20)) //30
println(20 ~: foo)

val myList = List(1,2,3,4)
val myList1 = 1 :: 2 :: 3 :: 4 :: Nil

println(0 +: myList :+ 5) //List(0,1,2,3,4,5)
println(myList)
//println(0 :+ myList) //did not work :+ is not in List
println(myList == myList1) //true























