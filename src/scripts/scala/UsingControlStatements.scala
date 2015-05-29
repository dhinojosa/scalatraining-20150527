import scala.util.control.Breaks._

var i = 10
while (i > 0) {  //Not used often
 println(i)
 i = i - 1
}

var j = 10
breakable {
  do {
    if (j == 5) break
    println(j)
    j = j - 1
  } while (j > 0)
}

