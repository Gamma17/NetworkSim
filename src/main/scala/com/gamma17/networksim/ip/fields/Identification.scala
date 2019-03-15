package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object Identification extends Field("ID", 0, Field.max(16))

case class Identification(value: Int) {
  Identification.validate(value)
}
