import java.text.DateFormat._
import java.util.{Date, Locale}

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRENCH)
    println(df format now)
  }
}
