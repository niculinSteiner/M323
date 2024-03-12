object FoldLeftTasks {
  def run():Unit ={
    println("FoldLeft - Task 1: ")
    println(List(1, 2, 3, 4, 5).foldLeft(0)((sum, x) => sum + x))
    println("FoldLeft - Task 2: ")
    println(List("Hallo", " ", "Welt", "!").foldLeft("")((sum, string) => sum + string))
    println("FoldLeft - Task 3: ")
    val points = List((1, 3), (2, 5), (4, 8), (6, 2))
    val added = points.foldLeft((0.0, 0.0)) { (acc, point) =>
      (acc._1 + point._1, acc._2 + point._2)
    }
    println((added._1/points.size, added._2/points.size))
  }
}
