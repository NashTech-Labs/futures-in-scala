package futures

import org.scalatest.flatspec.AnyFlatSpec

import scala.concurrent.Await
import scala.concurrent.duration._

class MapAndFlatMapTest extends AnyFlatSpec {

  val mapAndFlatMap = new MapAndFlatMap

  "futureWithMap" should "return 20" in {
    val result = Await.result(mapAndFlatMap.futureWithMap, 2 seconds)
    assert(result == 20)
  }

  "futureWithFlatMap" should "return 90" in {
    val result = Await.result(mapAndFlatMap.futureWithFlatMap, 2 seconds)
    assert(result == 90)
  }
}
