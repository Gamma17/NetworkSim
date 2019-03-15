package com.gamma17.networksim

import com.gamma17.networksim.ip.Packet
import org.scalatest.FunSuite

class PacketTest extends FunSuite {

  test("Dummy test") {
    assert(Packet().toString == "I am an IP packet")
  }

}