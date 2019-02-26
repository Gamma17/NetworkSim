package networksim

import org.scalatest.FunSuite

class IpPacketTest extends FunSuite {

  test("Dummy test") {
    assert(new IpPacket().toString == "I am an IP packet")
  }

}