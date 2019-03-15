package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object TotalLength extends Field("Total Length", 20, Field.max(16))

case class TotalLength(value: Int) {
  TotalLength.validate(value)
}
