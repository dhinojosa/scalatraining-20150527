//src/scripts/scala/UsingTuples.scala

val a = ("one", 1, 1.0, "Foo", 'c')
val b = Tuple5.apply("one", 1, 1.0, "Foo", 'c')
val c = Tuple5.apply[String, Int, Double, String, Char]("one", 1, 1.0, "Foo", 'c')
val d:(String, Int, Double, String, Char) = a


def foo(x:Tuple3[Int, String, Double]) = x._2 + (x._3 + x._1)
// def foo(x:(Int, String, Double)) = x._2 + (x._3 + x._1)

println(a == b)
println(foo((1, "Wow", 190.33)))

val x@(fn, ln) = ("Daniel", "Hinojosa")

println(fn)
println(ln)
println(x)
println(x.isInstanceOf[Tuple2[String,String]])

val y = ("Vishu", "Reddy")

val s = y match {
   case t@(fname, lname) => s"""His first name is $fname and his last name is $lname, 
                                |and the full tuple is $t""".stripMargin
  // case t@(fname, mname, lname) => "full name" 
   case _ =>  "I have no idea who this person is" 
}

println(s)

case class Employee(firstName:String, lastName:String)  //no val are required

val Employee(fn2, ln2) = Employee("Chandan", "Joarder")

println(fn2)
println(ln2)

def concatAll(x:String, y:String, z:Int, w:Int) = (x + y, z + w)

println(concatAll("Foo", "Jonathan", 40, 12))













