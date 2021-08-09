package futures

import org.scalatest.flatspec.AnyFlatSpec

import scala.concurrent.Await
import scala.concurrent.duration._

class RecoverWithTest extends AnyFlatSpec {

  val recoverWith = new RecoverWith

  "recoveredWithFuture" should "return Integer maximum value" in {
    val result = Await.result(recoverWith.recoveredWithFuture, 2 seconds)
    assert(result == Int.MaxValue)
  }
}
