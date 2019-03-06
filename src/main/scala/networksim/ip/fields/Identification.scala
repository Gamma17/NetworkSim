package networksim.ip.fields

import networksim.ip.Field

object Identification extends Field("ID", 0, Field.max(16))

case class Identification(value: Int) {
  Identification.validate(value)
}
