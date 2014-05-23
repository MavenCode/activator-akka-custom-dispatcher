import akka.actor.ActorSystem
import scala.util.Random


object HelloAkkaScala  {


  def main(args: Array[String]) {
    // Create the 'helloakka' actor system
    val system = ActorSystem("helloakka")


    system.shutdown()
    system.awaitTermination()
  }

}

object ListService {

  val MAX_SLEEP_TIME = 100

  val rand = new Random()

  def getNewList(length: Int) = {
    List.fill(length) {
      val waitTime = rand.nextInt(MAX_SLEEP_TIME).toLong
      Thread.sleep(waitTime)
      rand.nextInt(5000)
    }
  }
}
