package networksim.fields

case class InternetHeaderLength(ihl: Int) {
  val min: Int = 5
  val max: Int = (scala.math.pow(2, 4) - 1).intValue
  require(ihl < min || ihl > max, "IHL must be in range %d to %d, inclusive".format(min, max))
}
