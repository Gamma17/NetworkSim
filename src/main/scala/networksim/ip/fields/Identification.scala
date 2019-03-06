package networksim.ip.fields

object Identification extends Field("ID", 0, Field.max(16))

case class Identification(value: Int) {
  Identification.validate(value)
}
