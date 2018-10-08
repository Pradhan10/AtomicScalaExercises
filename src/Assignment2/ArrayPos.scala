package Assignment2

import scala.util.Sorting

object ArrayPos extends App {

  val arr = Array(12, 43, 121, 10)
  val ans = find(arr, 10)

  def find(numbers: Array[Int], num: Int): Option[Int] = {
    Sorting.quickSort(numbers)
    if (numbers.contains(num)) {
      var index = 0

      def findFirstIndexOf(findThis: Int): Int = findThis match {
        case 0 => index
        case _ => {
          for (i <- Range(0, numbers.length)) {
            //println("iteration i : "+i) /*DEBUG ONLY*/
            if (numbers(i).equals(num)) {
              //println("numbers(i) "+numbers(i)+" equals : "+num+" val of i :"+i) /*DEBUG ONLY*/
              index = i
            }
          }
          index
        }
      }

      Some(findFirstIndexOf(num))
    } else {
      None
    }
  }

  println(ans)
}
