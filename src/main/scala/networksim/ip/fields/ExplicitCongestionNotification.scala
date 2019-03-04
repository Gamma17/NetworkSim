package networksim.ip.fields

object ExplicitCongestionNotification extends Field("ECN", 0, Field.max(2), Some(Array(0)))

case class ExplicitCongestionNotification(value: Int = 0) {
  ExplicitCongestionNotification.validate(value)
}
