//AnyVal 

val b:Byte = 10 //8 bits
println(b)

val bmax:Byte = 127 // 127 is the max 2 to 7 minus 1
//val bmaxplus:Byte = 128

println(bmax)
//println(bmaxplus)

val bmin:Byte  = -128
//val bminplus:Byte = -129

println(bmin)
//println(bminplus)

val s = 40:Short
val s2:Short = 40

val g = 12:Long
val g2:Long = 12

val f = 120.00f

val d = 120.00
val d2 = 120.00D
val d3 = 120.00d

val b1:Boolean = true
val b2 = false

val c = 'c'
val c2 = 'A'
val c3 = '\u005A'

println(c3)

//Strings are an AnyRef
val str = "Why hello there! Dr. \u005A!"
println(str)

val smart = s"""I like to teach the world
                @to sing in perfect
                @harmony, I like to buy a world ${g2} 
                @generic soft drink beverages, because Pepsi
                @won't pay me. Dan says
                @"We should get a break"""".stripMargin('@')

println(smart)


