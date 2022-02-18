object S010_Classes extends  App {
  // Classes are prototype/blueprint to create objects

  // member variables = attributes
  // member variables can be declared as pat class definition
  // var, val in class declaration means they are member variables
  class Product(val price: Double, var discount: Double) {
    // default constructor in C++/Java/C#
    // __init__
    // class body, this area itself is a constructor, initialize objects
    println ("Product created ", price, discount)
    // member variable, defined in class body
    // Double type, type is inferred
    var total = price - (price * discount) / 100.0

    //toString, Java/Scala/C#, similar to __str__ in python
    override def toString: String = "(" + price + "," + discount + "," + total + ")"
  }

  val p1: Product = new Product(100, 5)
  // type inference
  val p2 = new Product(150, 10)

  println(p1.price, p1.discount, p1.total)

  println(p2) // calls p2.toString() to get string data

  val s = p2.toString()
  println(s)
}
