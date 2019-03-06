package networksim.ip.fields

object HeaderChecksum extends Field("Header Checksum", 0, Field.max(16))

case class HeaderChecksum(value: Int) {
  HeaderChecksum.validate(value)
}

