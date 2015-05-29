

val a = (x:Int) => x + 1
val b = {x:Int => x + 1}

println(a.apply(1))
println(b.apply(2))
println(a(1))
println(b(2))

val c:Int => Int = (x:Int) => x + 1
val d:Function1[Int,Int] = (x:Int) => x + 1

val e = (x:Int, y:Int) => x + y + 10
val f:(Int, Int) => Int = e
val g:Function2[Int, Int, Int] = e

def applyFunction(x:Int, fn:Int => Int) = fn(x)
def applyStrFunction(x:String, fn:String => Int) = fn(x)

println(applyFunction(3, c))

println(applyFunction(10, (x:Int) => x * x))

println(applyStrFunction("Hello", (x:String) => x.size))

def applyAnythingFunction[A,B](x:A, fn:A => B):B = fn(x)

println(applyAnythingFunction(3, c))

val h = (t:(Int, Int, Int)) => t._1 + t._2 + t._3

println(applyAnythingFunction((3, 5, 10), h))

abstract class Human {
   def fullName:String
}

class Person(firstName:String, lastName:String) extends Human {
   override def fullName = s"${firstName} ${lastName}"
}

val i = new Human {
    def fullName = "The Magnificent Madan"
}

println(i.fullName)

val j = new Function1[Int, Int] {
    def apply(x:Int):Int = x + 1
}

//w:applyFunction(
//e:applyFunction(
println(applyFunction(10, j))

//This is a method that takes an argument and returns a function
//This is also a closure, Vishu knows everything, ask him.
def returningFunctions(x:Int):(Int => Int) = {
  return (y:Int) => 19 + y + x
}

val k = returningFunctions(4)
val m = returningFunctions(5)

println(k(10))
println(k(12))
println(k(19))
println(m(10))

val o = (x:Int) => x % 2 == 0

println(List(1,2,3,4,5).filter(o))

println(List(1,2,3,4,5).find(o))

println(List(1,2,3,4,5).find(o).getOrElse("No evens found"))

val p = (x:Int) => x * x

println(List(1,2,3,4,5).map(p))

println(List(1,2,3,4,5).map((x:Int) => x * x))

println(List(1,2,3,4,5).map(x => x * x))

println(List(1,2,3,4,5).map((x:Int) => x * 2))

println(List(1,2,3,4,5).map(x => x * 2))

println(List(1,2,3,4,5).map(_ * 2))

println(List(1,2,3,4,5).map(2*))

val q = List(List(1,2,3), List(4, 5, 6), List(7, 8, 9))

println(q)

println(q.flatten)

println(List(1,2,3,4,5).map(x => List(x + 1, x + 2, x + 3)))

println(List(1,2,3,4,5).map(x => List(x + 1, x + 2, x + 3)).flatten)

println(List(1,2,3,4,5).flatMap(x => List(x + 1, x + 2, x + 3)))

println(List(1,2,3,4,5).map(x => if (x % 2 == 0) None else Some(x)))

List(1,2,3,4,5).flatMap(x => if (x % 2 == 0) None else Some(x)).foreach(println)











