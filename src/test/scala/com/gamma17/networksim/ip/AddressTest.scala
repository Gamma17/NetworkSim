package com.gamma17.networksim.ip

import org.scalatest.FunSuite

class AddressTest extends FunSuite {

  test("IP addresses are correctly represented") {
    val address = Address("166.20.17.255")
    assert(address.octets == (166, 20, 17, 255))
    assert(address.value == 2786333183L)
  }

  test("Invalid IP addresses are rejected") {
    val thrown = intercept[IllegalArgumentException] {
      Address("166.20.17.256")
    }
    assert(thrown.getMessage.contains("IP address is malformed"))
  }

}
