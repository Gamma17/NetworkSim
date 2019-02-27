package networksim.fields

class Version(version: Int = 4) {
  val min: Int = 0
  val max: Int = (scala.math.pow(2, 4) - 1).intValue
  if (version < min || version > max) {
    throw new IllegalArgumentException("Version must be in range %d to %d, inclusive".format(min, max))
  }
}
