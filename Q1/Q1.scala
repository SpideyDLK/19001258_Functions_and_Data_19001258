object negRat extends App{
  val n = new Rational(3,4)
  println(n.neg)
}

class Rational (n:Int,d:Int){
  def numer = n
  def denom = d

  def neg = new Rational(-this.numer,this.denom)
  override def toString = s"$numer/$denom"
}
