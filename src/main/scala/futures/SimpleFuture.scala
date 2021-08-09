package futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class SimpleFuture {

  def isPrime(num :Int) : Future[Boolean] = {
    Future(
      if (num <= 1)
        false
      else if (num == 2)
        true
      else
        !(2 until num).exists(x => num % x == 0)
    )
  }
}
