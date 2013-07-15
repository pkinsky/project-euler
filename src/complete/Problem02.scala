
/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

package complete

object Problem2 {
  def main(args: Array[String]): Unit = {

    println(fib_until(4000000).filter(x => x % 2 == 0).foldLeft(0)((a, b) => a + b))

  }

  //the fibonacci sequence until max 
  //(okay, it's a set. Order doesn't matter for this problem)
  def fib_until(max: Int) = {
    def go(a: Int, b: Int, acc: Set[Int]): Set[Int] = b match {
      case x if x > max => acc
      case x => go(b, a + b, acc + b)
    }

    go(1, 2, Set())
  }
}