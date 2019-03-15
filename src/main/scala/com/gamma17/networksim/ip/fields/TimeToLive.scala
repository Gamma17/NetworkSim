package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object TimeToLive extends Field("TTL", 0, Field.max(8))

case class TimeToLive(value: Int = 255) {
  TimeToLive.validate(value)
}
