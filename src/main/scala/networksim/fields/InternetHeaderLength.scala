package networksim.fields

class InternetHeaderLength(ihl: Int) {
  val min: Int = 5
  val max: Int = (scala.math.pow(2, 4) - 1).intValue
  if (ihl < min || ihl > max) {
    throw new IllegalArgumentException("IHL must be in range %d to %d, inclusive".format(min, max))
  }
}
