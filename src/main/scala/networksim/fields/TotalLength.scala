package networksim.fields

object TotalLength extends Field("Total Length", 20, Field.max(16))

case class TotalLength(value: Int) {
  TotalLength.validate(value)
}
