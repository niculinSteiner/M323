object FlatMapTasks {
  def run(): Unit = {
    println("FlatMap - Task 1: ")
    println(List(List(1, 2), List(3, 4), List(5, 6)).flatMap(_.map(number => number * 2)))
    println("FlatMap - Task 2: ")
    println(List(("Max", List("Blau", "Grün")), ("Anna", List("Rot")), ("Julia", List("Gelb", "Blau", "Grün"))).flatMap(_._2).distinct)
  }
}
