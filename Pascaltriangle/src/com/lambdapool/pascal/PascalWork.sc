def printTriangle() = {
  def f(a:Int):Int = if (a <= 0) 1 else a * f(a - 1)
  def binCalculus(n:Int, k:Int):Int = f(n) / (f(k) * f(n - k))
  for (r <- 0 to 10) {
    // columns
    for (c <- 0 to r) {
      print(binCalculus(r, c) + " ")
    }
    println()
  }
}
printTriangle()

/*
  1
 1 1
1 2 1
 */