package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class Recover {

  val recoveredFuture: Future[Int] = Future(5 / 0).recover {
    case _: ArithmeticException => 0
  }
}
