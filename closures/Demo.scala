object Demo {
  def main(args: Array[String]) {
    println("multiplier(1) value = " + multiplier(1));
    println("multiplier(2) value = " + multiplier(2));
  }
  var factor = 3;
  var multiplier = (i: Int) => i * factor;
}