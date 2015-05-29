// src/scripts/scala.UsingClasses.scala


class Employee(val eid:String, val firstName:String, val lastName:String) {  
  //extends from AnyRef by default

  require (eid.nonEmpty, "EID cannot be blank")  //Precondition, IllegalArgumentException
  require (firstName.nonEmpty, "firstName cannot be blank")  //Precondition, IllegalArgumentException
  require (lastName.nonEmpty, "lastName cannot be blank")  //Precondition, IllegalArgumentException

  def this(firstName:String, lastName:String) = this("000-00-0000", firstName, lastName)

  def this(firstName:String) = this(firstName, "Unknown")
 
  def this() = this("Unknown")

  override def toString = s"Employee($firstName, $lastName)"
}

class Manager(firstName:String, lastName:String, val employees:List[Employee]) 
      extends Employee(firstName, lastName)

val e = new Employee("Tom", "Kyte")
val f = new Employee("Jimmy", "Kimmel")

println(e.toString)

val m = new Manager("Donald", "Trump", List(e,f))
println(m)

val n:Employee = m
val o:Manager = m
val p:AnyRef = m
val q:Any = m

val employees = List[Employee](e, f, m)

val r = new Employee()
println(r)
println(r.eid)
println(r.firstName)
println(r.lastName)

val s = new Employee(lastName = "Powell", eid="333-02-1200", firstName="Jeremiah")

println(s)

try {
  val t = new Employee("", "James", "Langerstino") // Will go boom!
} catch {
  case exp:Exception => exp.printStackTrace()
}

println("I can continue on...")

case class Department(val name:String = "Computers")
   /* override def equals(other:Any):Boolean = {
       if (!(other.isInstanceOf[Department])) false
       val otherDept:Department = other.asInstanceOf[Department]
       name == otherDept.name
   } */


val mens = new Department("Men's Department")
val ladies = new Department("Women's Department")
val defaultDepartment = new Department()

println(mens.name)
println(ladies.name)
println(defaultDepartment.name)

println(mens)
println(ladies)


val ladies2 = new Department("Women's Department")

println(ladies == ladies2) //false














