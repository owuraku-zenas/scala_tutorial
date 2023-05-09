package io.turntable.scala

object Hello extends App {
   def celsiusToFahrenheit(celsius: Double): Double = (celsius * 9 / 5) + 32
   println(celsiusToFahrenheit(32))


  def formatDate(date: String): String = {
    val monthString = date.substring(3, 5)
    val yearString = date.substring(6)

    val dayString = date.substring(0, 2)

    val day: String = {
      if (dayString.toInt > 10 && dayString.toInt < 14) {
        s"${dayString}th"
      } else {
      dayString.substring(1) match
        case "1" => s"${dayString.toInt}st"
        case "2" => s"${dayString.toInt}nd"
        case "3" => s"${dayString.toInt}rd"
        case _ => s"${dayString.toInt}th"
      }
    }

    val month: String = {
      monthString match {
        case "01" => "January"
        case "02" => "February"
        case "03" => "March"
        case "04" => "April"
        case "05" => "May"
        case "06" => "June"
        case "07" => "July"
        case "08" => "August"
        case "09" => "September"
        case "10" => "October"
        case "11" => "November"
        case "12" => "December"
        case _ => "Month"
      }
    }
     s"${day} ${month} 20${yearString}"
  }
  println(formatDate("03/01/50"))


  def extractUserInfo(userInfo: String): String = {
    val userData: Array[String] = userInfo.split(":")
    val data = raw"(.*):(.*):([0-9]*):([0-9]*):(.*):(.*)".r
//    val data (username,password,userid,groupId,description,homeDirectory,shell) = userInfo

    s"""
    |Username: ${userData(0)}
    |Password: ${userData(1)}
    |UserID: ${userData(2)}
    |GroupID: ${userData(3)}
    |Description: ${userData(4)}
    |Home Directory: ${userData(5)}
    |Shell: ${userData(6)}
    |""".stripMargin
  }
  println(extractUserInfo("root:x:0:0:root:/root:/bin/bash"))
}

