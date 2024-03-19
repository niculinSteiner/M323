case class User(name: String, tasks: List[String])


object ForComprehensionsTasks {
  private val colors = List("Red", "Green", "Blue")
  private val fruits = List("Apple", "Banana", "Orange")

  private val users = List(
    User("Alice", List("Task 1", "Task 2", "Task 3")),
    User("Bob", List("Task 1", "Task 4", "Task 5")),
    User("Charlie", List("Task 2", "Task 3", "Task 6"))
  )

  private val tasksCompleted = List("Task 1", "Task 3", "Task 5")


  def run(): Unit = {
    println("ForComprehensions - Task 1: ")
    println(for (n <- 1 to 10) yield n * n)
    println("ForComprehensions - Task 2: ")
    println(for (n <- 1 to 20 if n % 2 == 0) yield n)
    println("ForComprehensions - Task 3: ")
    println(for {color <- colors
                 fruit <- fruits} yield (color, fruit))
    println("ForComprehensions - Task 4: ")
    println(for {user <- users} yield (user.name, for {task <- user.tasks if !tasksCompleted.contains(task)} yield task))
  }
}
