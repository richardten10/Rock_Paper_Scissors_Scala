package packageone

import java.sql.Date
import java.time.format.{DateTimeFormatter, DateTimeParseException}
import java.time.{LocalDate, ZoneId, ZonedDateTime}
import java.util.Scanner

import packageone.ComputerMove.{list, move}

import scala.util.Random

object test extends App {
  println(datestuff.dateNow)
  println(matches.getDays)
  println(datestuff.month)
  println(datestuff.year)
}

object matches {

  def getDays: String = {
    var dayToCheck = ""
    datestuff.days match {
      case "01" => dayToCheck = "1"
      case "02" => dayToCheck = "2"
      case "03" => dayToCheck = "3"
      case "04" => dayToCheck = "4"
      case "05" => dayToCheck = "5"
      case "06" => dayToCheck = "6"
      case "07" => dayToCheck = "7"
      case "08" => dayToCheck = "8"
      case "09" => dayToCheck = "9"
      case _ => dayToCheck = datestuff.days
    }
    return dayToCheck
  }
  def getMonth: String = {
    var monthToCheck = ""
    datestuff.month match {
      case "01" => monthToCheck = "1"
      case "02" => monthToCheck= "2"
      case "03" => monthToCheck= "3"
      case "04" => monthToCheck= "4"
      case "05" => monthToCheck= "5"
      case "06" => monthToCheck= "6"
      case "07" => monthToCheck = "7"
      case "08" => monthToCheck = "8"
      case "09" => monthToCheck = "9"
      case "10" => monthToCheck = "9"
      case "11" => monthToCheck = "9"
      case "12" => monthToCheck = "9"

    }
    return monthToCheck
  }

  def getYear: String = {
    return datestuff.year
  }
}
  object datestuff {
    private val getDays = DateTimeFormatter.ofPattern("dd")
    private val getMonth = DateTimeFormatter.ofPattern("MM")
    private val getYear = DateTimeFormatter.ofPattern("yyyy")
    val dateNow = LocalDate.now().plusDays(11)
    val days = dateNow.format(getDays)
      val month = dateNow.format(getMonth)
        val year = dateNow.format(getYear)



}


