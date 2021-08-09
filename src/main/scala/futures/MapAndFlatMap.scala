package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class MapAndFlatMap{

  val future: Future[Int] = Future(10)
  val futureWithMap: Future[Int] = future.map(_ + 10)

  def add(num1: Int, num2: Int): Future[Int] = Future(num1 + num2)
  def multiply(num1: Int, num2: Int): Future[Int] = Future(num1 * num2)

  val futureWithFlatMap: Future[Int] = add(6, 3).flatMap {
    result => multiply(result, 10)
  }
}
