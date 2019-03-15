package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object Version extends Field("Version", 0, Field.max(4), Some(Array(4))) {
  val IPv4 = 4
}

case class Version(value: Int = 4) {
  Version.validate(value)
}
