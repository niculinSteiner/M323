import scala.collection.immutable.Range

case class Adresse(strasse: String, hausnummer: Int, postleitzahl: String, stadt: String)

object MapTasks {
  private val adressen = List(
    Adresse("Hauptstrasse", 10, "12345", "Musterstadt"),
    Adresse("Nebenstrasse", 5, "23456", "Beispielburg"),
    Adresse("Aebenstrasse", 5, "23456", "Beispielburg")
  )

  def run(): Unit = {
    println("Map - Task 1: ")
    println(doubleNumberInList(List(1, 2, 3, 4, 5)))
    println("Map - Task 2: ")
    println(List("Alice", "Bob", "Charlie").map(name => name.toUpperCase()))
    println("Map - Task 3: ")
    println(List[Double](12, 45, 68, 100).map(number => number / 2))
    println("Map - Task 4: ")
    println(adressen.map { adresse =>
      s"(${adresse.strasse} ${adresse.hausnummer}, ${adresse.postleitzahl} ${adresse.stadt})"
    })
    println("Map - Task 5: ")
    println(List("Max Mustermann", "Erika Mustermann").map(_.toUpperCase))
  }

  private def doubleNumberInList(oldList: List[Int]): List[Int] = {
    oldList.map(number => number * 2);
  }
}
