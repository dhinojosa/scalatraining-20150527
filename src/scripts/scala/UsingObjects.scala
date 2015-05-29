

object MySingleton {
   def foo = 19
}

val a = MySingleton
val b = MySingleton

println(a == b) //object equality
println(a eq b) //ref equality

println(MySingleton.foo)
println(a.foo)
println(b.foo)

val c:MySingleton.type = MySingleton

class Employee(private val eid:String, val firstName:String, val lastName:String) {  
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

object Employee {
   def create3WithSameName(firstName:String, lastName:String):List[Employee] = {
      List(new Employee(firstName, lastName), 
           new Employee(firstName, lastName),
           new Employee(firstName, lastName))
   }

   def retreiveSecretInfo(x:Employee) = {
       x.eid
   }
}

println(Employee.create3WithSameName("Diane", "Sawyer"))

println(Int.MinValue)


val d = new Employee("100-00-1029", "Laura", "Bocelli")
println(Employee.retreiveSecretInfo(d))

class Foo(x:Int) {
   def apply(y:Int) = x + y
}

val foo = new Foo(10)
println(foo.apply(30))
println(foo(30))


val list = List(1,2,3,4,5,6)
val list2 = List.apply(1,2,3,4,5,6) //if you don't see a new, look in the companion object

val item2 = list(1)
val item2alternate = list.apply(1)










