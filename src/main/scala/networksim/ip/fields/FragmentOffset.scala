package networksim.ip.fields

object FragmentOffset extends Field("Fragment Offset", 0, Field.max(13))

case class FragmentOffset(value: Int = 0) {
  FragmentOffset.validate(value)
}
