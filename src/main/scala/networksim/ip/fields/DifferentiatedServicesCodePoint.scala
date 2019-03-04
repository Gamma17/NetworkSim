package networksim.ip.fields

object DifferentiatedServicesCodePoint extends Field("DSCP", 0, Field.max(6), Some(Array(0)))

case class DifferentiatedServicesCodePoint(value: Int = 0) {
  DifferentiatedServicesCodePoint.validate(value)
}
