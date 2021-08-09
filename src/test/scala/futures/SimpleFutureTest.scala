package futures

import org.scalatest.flatspec.AnyFlatSpec

import scala.concurrent.Await
import scala.concurrent.duration._

class SimpleFutureTest extends AnyFlatSpec {

  val simpleFuture = new SimpleFuture

  "isPrime" should "return true when 7 is passed to it" in {
    val result = Await.result(simpleFuture.isPrime(7), 2 seconds)
    assert(result)
  }

  "isPrime" should "return false when 4 is passed to it" in {
    val result = Await.result(simpleFuture.isPrime(4), 2 seconds)
    assert(!result)
  }
}
