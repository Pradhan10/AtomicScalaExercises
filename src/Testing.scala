/*
 Create a value named myValue1 initialized to 20. Create a value
named myValue2 initialized to 10. Use “is” to test that they do not
match
@Author Pradhan Rishi Sharma
@mail pradhanrishi10@yandex.com
* */

import com.atomicscala.AtomicTest._

object Testing extends App {

  val myValue1 = 20
  val myValue2 = 10

  myValue1 is myValue2

  val myValue3 = 10
  val myValue4 = 10

  myValue3 is myValue4

  val myValue5 = "10"
  myValue2 is myValue5
}
