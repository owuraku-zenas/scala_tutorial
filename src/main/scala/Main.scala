package io.turntable.scala

object Main extends App {
  var trade: Trade = new Trade("1", "USD", 50, 6000.00, 0.5)
  println(trade)
  println(trade.price)
  trade.price = -3
  println(trade.price)
  trade.price = 300
  println(trade.price)
  println(trade.value())

  // This throws an exception
  // The Scala way
//  val trade1: Trade = Trade("1", "USD", 50, -5, 0.5)
  val trade2: Trade = Trade("1", "USD", 50)
  println(trade2)
  // Unapply method for accessing the values of an object
  val (id, symbol, quantity) = Trade.unapply(trade2)
  println(s"$id,  $symbol, $quantity")

  // Case Classes Implementing toString, equals and hashCode
  val account: Account = Account(2, "Zenas", 1_000_000_000)
  val account2: Account = Account(2, "Zenas", 1_000_000_000)
  println(account.toString)
  println(account.equals(account2))

  
  
}
