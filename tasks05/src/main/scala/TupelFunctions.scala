package scala

import java.time.LocalTime

object TupelFunctions {

  private val example1 = trending(List(BigDecimal(1), BigDecimal(4), BigDecimal(3), BigDecimal(8)))
  private val example2 = trending(List(BigDecimal(1), BigDecimal(2), BigDecimal(3), BigDecimal(8)))

  private val weatherData = List(
    ("Sonnig", LocalTime.now(), "22"),
    ("Kalt", LocalTime.now() , "10"),
    ("Windig", LocalTime.now() , "15"),
  )
    def run():Unit = {
      println("Tupel - Tasks 1: ")
      println(weatherFunction())
      println("Tupel - Tasks 2: ")
      println(readWeatherData())
      println("Tupel - Tasks 3: ")
      println("Excpect: false  \nActual:" + example1)
      println("\nExcpect: true  \nActual:" + example2)
    }

  def trending(rates: List[BigDecimal]): Boolean = {
    rates.zip(rates.drop(1)).forall { case (prev, curr) => curr > prev }
  }



  private def weatherFunction(): (String, LocalTime, String) = {
    ("Sonnig", LocalTime.now(), "22")
  }

  private def readWeatherData():Unit = {
    println(weatherData.map(_._1).filter(!_.equals("Sonnig")))
  }
}