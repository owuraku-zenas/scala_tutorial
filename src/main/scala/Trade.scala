package io.turntable.scala

class Trade(val id: String, val symbol: String, val quantity: Int, var initialPrice: Double = 0, val dividend: Double = 0) {
  private var _price = initialPrice

  def price = _price //getter method

  def price_=(value: Double) = { if (value >= 0) _price = value }

  override def toString: String = {
    s"""
      |ID: ${id}
      |symbol: ${symbol}
      |Quantity: ${quantity}
      |Price: ${_price}
      |Dividend ${dividend}
      |""".stripMargin
  }
  
  def value(): Double = {
    quantity * price
  }
}


object Trade {
  def apply(id: String, symbol: String, quantity: Int, initialPrice: Double, dividend: Double) = {
    // This is the Java way
    // if (initialPrice < 0) throw new Exception("price must be positive")
    // This is the scala way
    require(initialPrice > 0)
    new Trade(id, symbol, quantity, initialPrice, dividend)
  }

  def apply(id: String, symbol: String, quantity: Int) = {
    new Trade(id, symbol, quantity, initialPrice=0, dividend=0)
  }

  def unapply(trade: Trade): (String, String, Int) = (trade.id, trade.symbol, trade.quantity)
}