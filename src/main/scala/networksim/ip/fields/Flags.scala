package networksim.ip.fields

object Flags extends Field("", 0, 2) {
  val DontFragment = Integer.parseInt("010", 2)
  val MoreFragments = Integer.parseInt("001", 2)
  val NoMoreFragments = Integer.parseInt("000", 2)
}

case class Flags(value: Int = Flags.NoMoreFragments) {
  Flags.validate(value)
}
