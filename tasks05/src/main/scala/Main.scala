object Main {
  def main(args: Array[String]): Unit = {
    //task 1 - init map
    val m1: Map[String, String] = Map("key" -> "value")
    println(s"task 1: \n $m1")
    //task 2 - add item
    println(s"task 2:")
    val m2 = m1 + ("newKey2" -> "newValue2")
    println(m2)
    //task 3 - modify item
    println(s"task 3:")
    val m3 = m2 + ("newKey2" -> "different")
    println(m3)
    //task 4 - remove item
    println(s"task 4:")
    val m4 = m3 - "newKey2"
    println(m4)
    //task 5 - get by key
    println(s"task 5:")
    val value = m4("key")
    println(value)
    //task 6 - no existing value
    println(s"task 6:")
    val notHereValue: Option[String] = m4.get("key3")
    println(notHereValue)
    TupelFunctions.run();
  }

}
