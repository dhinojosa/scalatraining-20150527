#!/usr/bin/scala
exec scala "$0" "$@"
!#

if (args.isEmpty) {
 println("Roger Roger")
} else if (args.size == 1) {
 println(s"Roger Roger with one item: ${args(0)}")
} else {
 println(s"Roger Roger with more args: ${args.mkString(",")}")
}
