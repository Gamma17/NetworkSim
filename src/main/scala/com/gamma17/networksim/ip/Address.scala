package com.gamma17.networksim.ip

object Address {
  val PowersOf256 = Array(16777216L, 65536L, 256L, 1L)

  // https://www.oreilly.com/library/view/regular-expressions-cookbook/9780596802837/ch07s16.html
  val Pattern = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"
}

case class Address private(dottedDecimal: String) {
  require(dottedDecimal.matches(Address.Pattern), "IP address is malformed: %s".format(dottedDecimal))

  def octets = dottedDecimal.split("\\.") match {
    case Array(_1, _2, _3, _4) => (_1.toInt, _2.toInt, _3.toInt, _4.toInt)
  }

  def value = (dottedDecimal.split("\\.").map(_.toInt), Address.PowersOf256).zipped.map { case (v, p) => v * p }.fold(0L)(_ + _)

}
