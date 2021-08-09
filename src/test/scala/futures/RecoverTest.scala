package futures

import org.scalatest.flatspec.AnyFlatSpec

import scala.concurrent.Await
import scala.concurrent.duration._

class RecoverTest extends AnyFlatSpec {

  val recover = new Recover

  "recoveredFuture" should "return 0" in {
    val result = Await.result(recover.recoveredFuture, 2 seconds)
    assert(result == 0)
  }
}
