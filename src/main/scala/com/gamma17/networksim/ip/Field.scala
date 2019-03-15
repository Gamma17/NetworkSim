package com.gamma17.networksim.ip

object Field {
  def max(numberOfBits: Int) = (scala.math.pow(numberOfBits, 2) - 1).intValue
}

case class Field(name: String, min: Int, max: Int, supportedValues: Option[Array[Int]] = None) {
  def validate(value: Int) {
    require(min <= value && value <= max, "Illegal value: %d. %s must be in range %d to %d, inclusive".format(value, name, min, max))
    if (supportedValues.isDefined && !supportedValues.get.contains(value)) {
      throw new NotImplementedError("Although %d is valid, it is not supported by this simulation. The supported values are: %s".format(value, supportedValues))
    }
  }

}
