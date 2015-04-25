object Timer {
  def oncePerSecond(cb: () => Unit): Unit = {
    while (true) {
      cb();
      Thread sleep 1000
    }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
