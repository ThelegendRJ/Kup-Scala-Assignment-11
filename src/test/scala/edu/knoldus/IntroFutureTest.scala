package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class IntroFutureTest extends AnyFlatSpec {
  // case-1

  val obj= new IntroFuture("./src")
  "If you give path of directory which is  present" should "return the path" in{
    assert(obj.content== List("()"))
  }

  //case-2

  val obj3= new IntroFuture("")
  "If path field is empty" should "return"in{
    assert(obj3.content==List("Path Not Found"))
  }
}