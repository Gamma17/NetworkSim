package networksim.ip

object Address {
  val PowersOf256 = Array(16777216L, 65536L, 256L, 1L)
}

case class Address private(dottedDecimal: String) {

  def octets = dottedDecimal.split("\\.") match {
    case Array(_1, _2, _3, _4) => (_1.toInt, _2.toInt, _3.toInt, _4.toInt)
  }

  def value = (dottedDecimal.split("\\.").map(_.toInt), Address.PowersOf256).zipped.map{case (v, p) => v * p}.fold(0L)(_ + _)

}
