
/**
 *  The first character of the name of file is 
 *  always capital: e.g. Employee.scala
 *
 *  A compound word is camel case: EmployeeOfTheMonth.scala
 *
 *  Package is all lowercase
 */

package com.xyzcorp.employee

//Classes first character is upper case, properties first char are lower case
//Both classes and properties are camel case for compound words.
class Employee(ssn:String, firstName:String, lastName:String) {
   def fullName = s"$firstName $lastName"
}

object Runner {
   //Method ALWAYS start with def
   //Unit means we are not returning anything, similar to void in Java
   //We always have a return type for a method, therefore we are using in this
   //case Unit
   def main(args:Array[String]):Unit = {
      println("We have an application!")
      val `employee of the month` = new Employee("123-04-1020", "Bob", "Barker") //Instantiation
      println(s"Yay! Created Employee, ${`employee of the month`.fullName}")
      val containsAFullName_? = `employee of the month`.fullName.nonEmpty
   }
}
