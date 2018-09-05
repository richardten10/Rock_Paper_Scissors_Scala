package packageone

object RepeatIfDraw {

  var rematch: Boolean = (inputCopy == ComputerMove.findComputerMove())
  var inputCopy = ""

  def rematch1 (): Unit = {

//    println(s"what I think you put in caps: $inputCopy")
//    println(s"whether or not I think it was a draw: $rematch")
    rematch match {
      case true => println("Repeat match since it was a draw")
        println()
        println("Write Rock, Paper, or Scissors!")
      case false => mainObject.i = mainObject.i - 1
    }
  }

  def makeUpperCase(input: String): Unit = {
    input match {
      case "rock" => inputCopy = "Rock"
      case "paper" => inputCopy = "Paper"
      case "scissors" => inputCopy = "Scissors"
      case _ => inputCopy = input
    }
    rematch = (inputCopy == ComputerMove.findComputerMove())
  }

}
