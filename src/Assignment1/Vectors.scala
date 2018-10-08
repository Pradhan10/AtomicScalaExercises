object Vectors extends App {

  // A Vector holds other objects:
  val v1 = new Vector()
  // v1 is Vector()
  var sum_of = Range.inclusive(0, 10)
  print(sum_of.isInclusive)

  /*List and set example*/
  var list = List("12", 12, true, "afasdasa")
  print(list)

  /*Create two vectors and compare*/
  var myvec1 = Vector(12, 32)
  var myvec2 = Vector(12, 32)

  assert(myvec1 == myvec2, "assert failed")

  //myvec1 is myvec2

}
