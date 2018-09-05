package packageone

import java.util.Scanner

object mainObject extends App {
  println("Write Rock, Paper, or Scissors!")
  val scanner = new Scanner(System.in)
  var i: Int = 1
  while (i>0) {
    val userInput = scanner.next()
    ComputerMove.setNewComputerMove()
    PlayerMove.findResult(userInput)
    println(s"Computer move was: ${ComputerMove.findComputerMove()}")
    RepeatIfDraw.makeUpperCase(userInput)
    RepeatIfDraw.rematch1()
  }
}



