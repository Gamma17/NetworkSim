package com.gamma17.networksim.ip.fields

import com.gamma17.networksim.ip.Field

object HeaderChecksum extends Field("Header Checksum", 0, Field.max(16))

case class HeaderChecksum(value: Int) {
  HeaderChecksum.validate(value)
}

