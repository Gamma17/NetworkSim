package networksim.fields

class DifferentiatedServicesCodePoint(dscp: Int = 0) {
  val min: Int = 0
  val max: Int = (scala.math.pow(2, 6) - 1).intValue
  if (dscp < min || dscp > max) {
    throw new IllegalArgumentException("DSCP must be in range %d to %d, inclusive".format(min, max))
  }
}
