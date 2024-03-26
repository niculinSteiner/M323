case class Course(title: String, students: List[String])

case class CourseSubscriptions(title: String, totalStudents: Int)

object Pipelines {

  private val courses = List(
    Course("M323", List("Peter", "Petra", "Paul", "Paula")),
    Course("M183", List("Paula", "Franz", "Franziska")),
    Course("M117", List("Paul", "Paula")),
    Course("M114", List("Petra", "Paul", "Paula")),
  )

  def run(): Unit = {
    println("Pipeline Tasks:")
    println("Peter besucht folgende Kurse: " + courses.filter(_.students.contains("Peter")).map(_.title).mkString)
    println("Petra besucht folgende Kurse: " + courses.filter(_.students.contains("Petra")).map(_.title).mkString(", "))
    println("Coursesubscription: " + courses.map(course => (course, course.students.length))
        .map { case (course, totalStudents) => CourseSubscriptions(course.title, totalStudents)}.mkString(", "))
  }


}
