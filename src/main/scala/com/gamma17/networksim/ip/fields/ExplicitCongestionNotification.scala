package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object ExplicitCongestionNotification extends Field("ECN", 0, Field.max(2), Some(Array(0)))

case class ExplicitCongestionNotification(value: Int = 0) {
  ExplicitCongestionNotification.validate(value)
}
