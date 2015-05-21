class Rational(numX:Int, denX:Int) {
  def num = numX
  def den = denX
  def +(that:Rational):Rational = {
    new Rational(num * that.den + that.num * den, den * that.den)
  }

  override def toString = num + "/" + den
}

object test{
  new Rational(2, 3) + new Rational(1,3)
  5 + 8
}