// Solution-7.scala
// Solution to Exercise 7 in "Class Arguments"
import com.atomicscala.AtomicTest._

val cup3 = new Cup3(0)

class Cup3(var percentFull: Int) {
  val max = 100

  def add(amount: Int): Int = {
    percentFull += amount
    if (percentFull > max) {
      percentFull = max
    }
    percentFull
  }
}

cup3.percentFull = 100 /*Setting the value*/
cup3.percentFull is 100 /*Getting the value*/

/* OUTPUT_SHOULD_BE
100
*/