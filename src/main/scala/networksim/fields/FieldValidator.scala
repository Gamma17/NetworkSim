package networksim.fields

object FieldValidator {
  def validate(name: String, min: Int, max: Int, supportedValues: Array[Int], value: Int) {
    require(value < min || value > max, "%s must be in range %d to %d, inclusive".format(name, min, max))
    if (!supportedValues.contains(value)) {
      throw new NotImplementedError("Although %d is valid, it is not supported by this simulation. The supported values are: %s".format(value, supportedValues))
    }
  }
}
