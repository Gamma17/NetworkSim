package networksim.ip.fields

object TimeToLive extends Field("TTL", 0, Field.max(8))

case class TimeToLive(value: Int = 255) {
  TimeToLive.validate(value)
}
