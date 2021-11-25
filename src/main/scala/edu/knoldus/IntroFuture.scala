package edu.knoldus
import scala.concurrent.duration.DurationInt
import scala.concurrent.ExecutionContext.Implicits.global
import scala.jdk.CollectionConverters.IteratorHasAsScala
import scala.concurrent.{Await, Future}
import java.nio.file.{FileSystems, Files}
import scala.language.postfixOps

class IntroFuture(path:String)  {
  val content: List[String] = Await.result(Search(path) ,2 second)

  def Search(path: String):Future[List[String]]= Future{
    Thread.sleep(1000)
    val file = FileSystems.getDefault.getPath(path)
    if(file.toFile.isDirectory || file.toFile.exists()) {
      List(Files.walk(file).iterator().asScala.foreach(println).toString)
    }
    else{
      List("Path Not Found")
    }
  }

}
