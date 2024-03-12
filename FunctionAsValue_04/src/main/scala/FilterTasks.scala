case class Buch(titel: String, autor: String, jahr: Int)

object FilterTasks {
  private val buecher = List(
    Buch("1984", "George Orwell", 1949),
    Buch("Brave New World", "Aldous Huxley", 1932),
    Buch("Fahrenheit 451", "Ray Bradbury", 1953)
  )

  def run(): Unit = {
    println("Filter - Task 1: ")
    println(List[Int](1, 2, 3, 4, 5).filter(_ % 2 == 0))
    println("Filter - Task 2: ")
    println(List("Alice", "Bob", "Charlie", "Diana").filter(_.length > 4))
    println("Filter - Task 3: ")
    println(List(12, 45, 68, 100).filter(_ > 50))
    println("Filter - Task 4: ")
    println(List("Scala", "ist", "fantastisch").filter(_.startsWith("S")))
    println("Filter - Task 5: ")
    println(buecher.filter(_.jahr < 1950).map(_.titel))
  }
}
