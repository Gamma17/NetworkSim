package networksim.ip.fields

object InternetHeaderLength extends Field("IHL", 5, Field.max(4), Some(Array(5)))

case class InternetHeaderLength(value: Int = 5) {
  InternetHeaderLength.validate(value)
}
