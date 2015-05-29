//src/scripts/scala/UsingOptions.scala

case class Employee(val eid:String, val firstName:String, val middleName:Option[String], 
               val lastName:String)

/*
 * All this is taken care of when you use case class
object Employee {
   def apply(eid:String, firstName:String, middleName:Option[String], lastName:String) = 
     new Employee(eid, firstName, middleName, lastName)
}
*/

val a = Employee("102-00-1002", "Logan", None, "Gonzales")
val b = Employee("111-49-3805", "Ann", Some("Lightning Fast"), "Chen")

println(b.middleName)
println(b.middleName.get)

println(a.middleName.getOrElse("Doesn't have a middle name"))
println(b.middleName.getOrElse("Doesn't have a middle name"))

def getMiddleName(x:Option[String]) = {
   x match {
     case Some(mn) => mn 
     case None => "Nothing"
   }
}


println(getMiddleName(a.middleName))
println(getMiddleName(b.middleName))
