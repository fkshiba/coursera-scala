package recfun

object Main {
  def main(args: Array[String]) {
//    println("Pascal's Triangle")
//    for (row <- 0 to 10) {
//      for (col <- 0 to row)
//        print(pascal(col, row) + " ")
//      println()
//    }

    println(balance(":-)".toList))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def loop(c2: Int, r2: Int):Int = {
      if (c2 == 0 || r2 == 0 || c2 == r2) 1
      else loop(c2 - 1, r2 - 1) + loop(c2, r2 - 1)
    }
    loop(c, r)
  }
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(chars2: List[Char], count: Int): Boolean = {
      if (chars2.isEmpty && count != 0) false
      else if (chars2.isEmpty) true
      else if (chars2.head == ')' && count == 0) false
      else if (chars2.head == ')') loop(chars2.tail, count-1)
      else if (chars2.head == '(') loop(chars2.tail, count+1)
      else loop(chars2.tail, count)
    }
    loop(chars, 0)
  }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0)
      1
    else if(money > 0 && !coins.isEmpty)
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else
      0
  }
}
