package networksim.ip.fields

import org.scalatest.FunSuite


class VersionTest extends FunSuite {

  test("Supported values accepted") {
    assert(Version(Version.IPv4).value == 4)
  }

  test("Illegal values throw IllegalArgumentException") {
    val thrown = intercept[IllegalArgumentException] {
      Version((scala.math.pow(2, 4) - 1).intValue + 1)
    }
    assert(thrown.getMessage.contains("Illegal value"))
  }

  test("Unsupported values throw NotImplementedError") {
    val thrown = intercept[NotImplementedError] {
      Version(6)
    }
    assert(thrown.getMessage.contains("not supported"))
  }

}
