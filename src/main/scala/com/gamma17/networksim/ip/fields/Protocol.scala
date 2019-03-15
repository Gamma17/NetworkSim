package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object Protocol extends Field("Protocol", 0, Field.max(8), Some(Array(6))) {
  val TCP = 6
}

case class Protocol(value: Int = 6) {
  Protocol.validate(value)
}
