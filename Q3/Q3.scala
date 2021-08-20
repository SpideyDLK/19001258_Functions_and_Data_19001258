object Acc extends App{
  val acc1 = new Account("990220115V",1234,12500.00)
  val acc2 = new Account("990220116V",5678,24500.00)
  acc2.transfer(acc1,4500.00)
  println(acc1)
  println(acc2)

}

class Account(id:String, n:Int, b:Double){
  val NIC:String = id
  val accNum: Int = n
  var Bal: Double = b

  def transfer(a:Account,b:Double) = {
    this.Bal -= b
    a.Bal += b
  }
  override  def toString = s"[$NIC:$accNum:$Bal]"
}
