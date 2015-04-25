/**
 * Simple fibonacci
 */
object Fib {
  def main(args: Array[String]) {
    print(fib(23));
  }

  def fib(n:Int): Int = {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 2) + fib(n - 1);
    }
  }
}
