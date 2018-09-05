package packageone

import scala.util.Random

object ComputerMove {

  val list = List("Rock", "Paper", "Scissors")
  var move: String = ""

  def setNewComputerMove (): Unit = {
    val randomChoice = Random.nextInt(2)
    move = list(randomChoice)
  }

  def findComputerMove (): String = {
    return move
  }

}
