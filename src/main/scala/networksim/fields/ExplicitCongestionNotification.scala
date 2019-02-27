package networksim.fields

class ExplicitCongestionNotification(ecn: Int = 0) {
  val min: Int = 0
  val max: Int = (scala.math.pow(2, 2) - 1).intValue
  if (ecn < min || ecn > max) {
    throw new IllegalArgumentException("ECN must be in range %d to %d, inclusive".format(min, max))
  }
}
