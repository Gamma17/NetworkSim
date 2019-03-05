package networksim.ip.fields

object Version extends Field("Version", 0, Field.max(4), Some(Array(4))) {
  val IPv4 = 4
}

case class Version(value: Int = 4) {
  Version.validate(value)
}
