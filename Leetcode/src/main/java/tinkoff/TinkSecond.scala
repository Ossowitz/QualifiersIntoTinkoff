package tinkoff

object TinkSecond {
  def main(args: Array[String]): Unit = {
    printNumbers(4, 3)
  }

  private def printNumbers(n: Int, m: Int): Unit = {
    val numbers = Array.ofDim[Int](m, n)
    var counter = 1
    for (i <- 0 until m + n - 1) {
      for (j <- 0 to i) {
        if (j < m && i - j < n) {
          numbers(j)(i - j) = counter
          counter += 1
        }
      }
    }

    for (row <- numbers) {
      for (num <- row) {
        print(num + " ")
      }
      println()
    }
  }
}