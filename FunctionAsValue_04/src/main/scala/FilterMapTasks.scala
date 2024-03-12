case class Mitarbeiter(name: String, abteilung: String, gehalt: Int)

object FilterMapTasks {
  private val mitarbeiter = List(
    Mitarbeiter("Max Mustermann", "IT", 50000),
    Mitarbeiter("Erika Musterfrau", "Marketing", 45000),
    Mitarbeiter("Klaus Klein", "IT", 55000),
    Mitarbeiter("Julia Gross", "HR", 40000)
  )
  private val kurse = List(
    "Programmierung in Scala",
    "Datenbanken",
    "Webentwicklung mit JavaScript",
    "Algorithmen und Datenstrukturen"
  )

  def run(): Unit = {
    println("FilterMap - Task 1: ")
    println(mitarbeiter.filter(_.gehalt >= 50000).map(_.name.split(" ")(0).toUpperCase()))
    println("FilterMap - Task 2: ")
    println(kurse.filter(_.contains("Daten")).map(_.split(" ").mkString).sorted)

  }
}
