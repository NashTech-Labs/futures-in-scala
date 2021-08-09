package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Callbacks extends App {

  def addition(num1: Int, num2: Int): Future[Int] = Future(num1 + num2)

  val result: Future[Int] = addition(5, 3)

  result.onComplete{
    case Success(value) => println(s"Result from onComplete: $value")
    case Failure(exception) => println(s"Exception occurred: $exception")
  }

  result.foreach{ value =>
    println(s"Result from foreach: $value")
  }

  Thread.sleep(2000)
}
