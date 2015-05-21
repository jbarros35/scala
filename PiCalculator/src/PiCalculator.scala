/**
 * Created by jose on 12/7/2014.
 */
object PiCalculator {

  val input1 = BigDecimal(1.0) / BigDecimal(5.0)
  val input2 = BigDecimal(1.0) / BigDecimal(239.0)

  def pi = 4.0 * (4.0 * atan(input1) - atan(input2))

  def atan(x: BigDecimal):BigDecimal = {
    var result = x
    var xSquared = x * x
    var term = x
    var divisor = 1.0
    while(term.scale < 100) {
      divisor += 2.0
      term *= xSquared
      result -= term / divisor
      divisor += 2.0
      term *= xSquared
      result += term / divisor
    }
    result
  }

  def main(args: Array[String]) {
    println(pi)
  }
}
