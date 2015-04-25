object TreeTest {
  type Environment = String => Int

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(v) => v
  }

  val e:Environment = {
    case "a" => 1
    case "b" => 2
  }

  val t:Tree = Sum(Var("a"), Const(2))

  def main(args: Array[String]) {
    println(eval(t, e))
  }
}
