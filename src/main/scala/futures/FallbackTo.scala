package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class FallbackTo {

  def divide(numerator: Int, denominator: Int): Future[Int] =
    if (denominator == 0) {
      Future.failed(new IllegalArgumentException("Don't divide by zero"))
    } else {
      Future(numerator / denominator)
    }

  def multiply(num1: Int, num2: Int): Future[Int] =
    Future(num1 * num2)

  val fallbackToResult: Future[Int] = divide(5, 0).fallbackTo(multiply(5, 3))
}
