package networksim.fields

object Version {
  val Name = "Version"
  val Min = 0
  val Max: Int = (scala.math.pow(2, 4) - 1).intValue
  val Ipv4 = 4
  val supportedValues = Array(Ipv4)
}

class Version(value: Int = 4) {

  import Version._

  FieldValidator.validate(Name, Min, Max, supportedValues, value)
}
