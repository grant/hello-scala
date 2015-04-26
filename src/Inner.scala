class Inner {
  var p = "inner/"

  class AnotherInner {
    def path = p + "/last"
  }

  def ai(iv: Int): Inner.this.type#AnotherInner = {
    p += iv
    return new AnotherInner
  }
}
