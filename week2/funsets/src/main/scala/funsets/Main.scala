package funsets

object Main extends App {
  import FunSets._
  val s = Set(1, 2, 3)
  printSet(map(s, x => x + x))
}
