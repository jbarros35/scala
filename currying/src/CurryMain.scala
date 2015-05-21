/**
 * Created by jose on 11/22/2014.
 */
object CurryMain {

  // simple sum from a to b
  def sumSimple(a:Int, b:Int): Int = if (a > b) 0 else a + sumSimple(a + 1, b)

  // sum with currying
  def sum(f: Int => Int)(a: Int, b:Int): Int = if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  def cube(a: Int): Int = a * a * a

  def fact(a: Int): Int = if (a == 0) 1 else a * fact(a - 1)

  def main(args: Array[String]) {
    val z = fact(3)
    val w = cube(3)
    val s = sumSimple(2, 5)
    val x = sum(cube)(2,3)
    val y = sum(fact)(2,3)
    println(z) // factorial
    println(w) // cubo
    println(s) // sum simple a + (a + 1) + ... b
    println(x) // sum(cube)
    println(y) // sum(fact)

  }

}
