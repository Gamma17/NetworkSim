package networksim.fields

object Version extends Field("Version", 0, (scala.math.pow(2, 4) - 1).intValue, Array(4)) {
  val Ipv4 = 4
}

case class Version(version: Int = 4) {

  import Version._

  validate(version)
}
