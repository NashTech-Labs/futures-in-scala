package futures

import org.scalatest.flatspec.AnyFlatSpec

import scala.concurrent.Await
import scala.concurrent.duration._

class FallbackToTest extends AnyFlatSpec {

  val fallbackTo = new FallbackTo

  "fallbackToResult" should "return 15" in {
    val result = Await.result(fallbackTo.fallbackToResult, 2 seconds)
    assert(result == 15)
  }
}
