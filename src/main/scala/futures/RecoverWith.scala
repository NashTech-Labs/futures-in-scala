package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class RecoverWith {

  val MaximumValue: Future[Int] = Future(Int.MaxValue)

  val recoveredWithFuture: Future[Int] = Future(5 / 0).recoverWith {
    case _: ArithmeticException => MaximumValue
  }
}
