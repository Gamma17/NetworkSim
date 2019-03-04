package networksim.fields

import org.scalatest.FunSuite


class VersionTest extends FunSuite {

  test("Supported values accepted") {
    assert(Version(4).version == 4)
  }

  test("Illegal values rejected") {
    val thrown = intercept[IllegalArgumentException] {
      Version((scala.math.pow(2, 4) - 1).intValue + 1)
    }
    assert(thrown.getMessage.contains("Illegal value"))
  }

  test("Unsupported values rejected") {
    val thrown = intercept[NotImplementedError] {
      Version(6)
    }
    assert(thrown.getMessage.contains("not supported"))
  }

}
