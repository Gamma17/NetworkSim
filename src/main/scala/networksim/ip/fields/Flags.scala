package networksim.ip.fields

import networksim.ip.Field

object Flags extends Field("Flags", 0, 2) {
  val DontFragment: Int = Integer.parseInt("010", 2)
  val MoreFragments: Int = Integer.parseInt("001", 2)
  val NoMoreFragments: Int = Integer.parseInt("000", 2)
}

case class Flags(value: Int = Flags.NoMoreFragments) {
  Flags.validate(value)
}
