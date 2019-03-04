package networksim.fields

case class Field(name: String, min: Int, max: Int, supportedValues: Array[Int]) {
  def validate(value: Int) {
    require(min <= value && value <= max, "Illegal value: %d. %s must be in range %d to %d, inclusive".format(value, name, min, max))
    if (!supportedValues.contains(value)) {
      throw new NotImplementedError("Although %d is valid, it is not supported by this simulation. The supported values are: %s".format(value, supportedValues))
    }
  }

}
