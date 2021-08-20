object Bank extends App{
  val acc1 = new Account("990220115V",1234,12500.00)
  val acc2 = new Account("990220116V",5678,24500.00)
  val acc3 = new Account("990220117V",4321,-6500.00)
  val acc4 = new Account("990220118V",8765,-14000.00)

  var bank:List[Account]=List(acc1,acc2,acc3,acc4)
  val od = (b:List[Account]) => b.filter(x=>x.Bal.<(0.0))
  val sumBal = (b:List[Account]) => b.reduce((a,b) => new Account("Total",0,a.Bal+b.Bal))
  val interest = (b:List[Account]) => b.map(x=> if (x.Bal<0) new Account(x.NIC,x.accNum,x.Bal*0.1+x.Bal) else new Account(x.NIC,x.accNum,x.Bal*0.05+x.Bal))
  print("List of Accounts with negative balances is: ")
  od(bank).foreach{
    x => print(x.accNum)
    print(" ")
  }
  println()
  println()
  println(s"Total of all account balances is: "+sumBal(bank).Bal)
  println()
  println("Final balances of all accounts: ")
  interest(bank).foreach{
    x => print(x.accNum)
    print(" = ")
    print(x.Bal)
    println()
  }
}

class Account(id:String, n:Int, b:Double){
  val NIC:String = id
  val accNum: Int = n
  var Bal: Double = b

  override  def toString = s"[$NIC:$accNum:$Bal]"
}
