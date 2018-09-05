package packageone

import java.util.Scanner

import scala.annotation.tailrec

object PlayerMove {
  var string: String = ""
//  val scanner = new Scanner(System.in)
//  val userInput = scanner.next()
//  val computerChoice: String =  ComputerMove.findComputerMove()

  def resultIfUserChoosesRock: String = {
    val computerChoice: String =  ComputerMove.findComputerMove()
    computerChoice match {
    case ("Rock") => string = "Draw!"
    case ("Paper") => string = "Computer wins"
    case ("Scissors") => string = "Player wins"
  }
    return string}

  def resultIfUserChoosesPaper: String =  {
    val computerChoice: String =  ComputerMove.findComputerMove()
    computerChoice match {
    case ("Rock") => string = "Player wins!"
    case ("Paper") => string = "Draw!"
    case ("Scissors") => string = "Computer wins!"
  }
    return string }

  def resultIfUserChoosesScissors: String = {
    val computerChoice: String =  ComputerMove.findComputerMove()
    computerChoice match {
    case ("Rock") => string = "Computer wins!"
    case ("Paper") => string = "Player wins!"
    case ("Scissors") => string = "Draw!"
  }
    return string
  }

  def findResult (input: String) = {
    input match {
      case ("Rock" | "rock") => println(resultIfUserChoosesRock)
      case ("Scissors" | "scissors") => println(resultIfUserChoosesScissors)
      case ("Paper" | "paper") => println(resultIfUserChoosesPaper)
      case _ => println("Incorrect input - restart please")
    }
  }
  }