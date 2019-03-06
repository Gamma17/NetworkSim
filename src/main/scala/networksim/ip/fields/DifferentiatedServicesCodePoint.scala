package networksim.ip.fields

import networksim.ip.Field

object DifferentiatedServicesCodePoint extends Field("DSCP", 0, Field.max(6), Some(Array(0)))

case class DifferentiatedServicesCodePoint(value: Int = 0) {
  DifferentiatedServicesCodePoint.validate(value)
}
