object subRat extends App{
  val n1 = new Rational(3,4)
  val n2 = new Rational(5,8)
  val n3 = new Rational(2,7)
  println((n1.sub(n2)).sub(n3))
}

class Rational (n:Int,d:Int){
  def numer = n
  def denom = d

  def sub(r: Rational) = new Rational(numer*r.denom - r.numer*denom, denom*r.denom)
  override def toString = s"$numer/$denom"

}
