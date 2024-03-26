import cats.effect.IO
import cats.effect.unsafe.implicits.global

import scala.util.Random

object IOTasks {
  def run(): Unit = {
    val allowToLeaf = allowToLeafHome
    println(allowToLeaf.unsafeRunSync())
  }

  private def rollDiceImpure(): Int = {
    val random = new Random
    random.nextInt(6) + 1
  }

  private def rollDice(): IO[Int] = {
    IO.delay(rollDiceImpure())
  }

  private def allowToLeafHome: IO[Boolean] = {
    val checkRoll = rollDice()
    checkRoll.map(_ == 6)
  }
}
