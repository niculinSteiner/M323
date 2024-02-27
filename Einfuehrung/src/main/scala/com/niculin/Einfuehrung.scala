package com.niculin

object Einfuehrung extends App {
  var cart: Array[String] = Array("test", "test1");
  var cart2: Array[String] = Array("test", "book");

  println("$$$$$$$$$$$$ Aufagbe 1 $$$$$$$$$$$$$$")
  println(wordScore("declarative"), wordScore("yes"))

  private def wordScore(word: String) = word.replace("a", "").length

  println("$$$$$$$$$$$$ Aufagbe 2 $$$$$$$$$$$$$$")

  println(ShoppingCart.calcDiscountPercentage(cart))
  println(ShoppingCart.calcDiscountPercentage(cart2))


}



