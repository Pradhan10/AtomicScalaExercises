/*
 Create a value named myValue1 initialized to 20. Create a value
named myValue2 initialized to 10. Use “is” to test that they do not
match
@Author Pradhan Rishi Sharma
@mail pradhanrishi10@yandex.com
* */

import scala.util.Try

object Testing extends App {

  /*conventional Exception handling in scala*/
  def di(a: Int): Int = {
    try {
      7 / a
    }
    catch {
      case e: ArithmeticException => {
        print("handled")
        9
      }
    }
  }

  //  di(0)

  /*Recommended exception handling in scala*/
  def divAgain(a: Int): Int = {
    Try(10 / a) match {
      case scala.util.Success(value) => {
        print("handled again")
        value
      }
      case scala.util.Failure(exception) => {
        print("do that")
        0
      }
    }
  }

  divAgain(0)
}

