package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object InternetHeaderLength extends Field("IHL", 5, Field.max(4), Some(Array(5)))

case class InternetHeaderLength(value: Int = 5) {
  InternetHeaderLength.validate(value)
}
