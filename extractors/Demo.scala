object Demo {
  def main(args: Array[String]) {
    println("Apply method: " + apply("Zara", "gmail.com"));
    println("Unapply method: " + unapply("Zara@gmail.com"));
    println("Unapply method: " + unapply("Zera Ali"));
  }

  /* The injection method (optional) */
  def apply(user: String, domain: String) = {
    user + "@" + domain
  }

  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"

    if (parts.length == 2) {
      return Some(parts(0), parts(1))
    } else {
      return None
    }
  }
}