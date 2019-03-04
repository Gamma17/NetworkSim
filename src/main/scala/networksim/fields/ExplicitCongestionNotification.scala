package networksim.fields

case class ExplicitCongestionNotification(ecn: Int = 0) {
  val min: Int = 0
  val max: Int = (scala.math.pow(2, 2) - 1).intValue
  require(ecn < min || ecn > max, "ECN must be in range %d to %d, inclusive".format(min, max))
}
