object LazyListTask {

  def run(): Unit = {
    println("Lazy List - Task 1:")
    println(LazyList.continually(List(1)).take(3).toList.flatten)
    println("Lazy List - Task 2:")
    println(LazyList.continually(List(1, 0)).take(2).toList.flatten)
    println("Lazy List - Task 3:")
    println(LazyList.continually(List(13).map(_ * 2)).take(1).toList.flatten)
    println("Lazy List - Task 4:")
    println(LazyList.continually(List(13).filter(_ % 2 != 0)).take(2).toList.flatten)
    println("Lazy List - Task 5:")
    println(LazyList.from(1).take(10).toList)
    println("Lazy List - Task 6:")
    println(LazyList.iterate(2)(_ * 2).take(10).toList)
    println("Lazy List - Task 7:")
  }
}
