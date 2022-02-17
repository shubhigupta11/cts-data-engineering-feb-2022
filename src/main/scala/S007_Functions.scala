object S007_Functions extends  App {
  // Functions are known as first class citizen , it means functions are objects
  // functions can be passed as argument, return as return value
  // Functions are known as lambda in Java, Python
  // use => to define functions in scala
  // method is not function , method is not an object

  // a function that takes no parameter, return no result
  val greeting = () => println("Good Afternoon")

  greeting()

  // a function that takes 1 parameter, return no result
  // function type is inferred by compiler
  val greet = (name: String) => println("Good Afternoon", name)

  greet("Venkat")
  // pow takes 1 parameter, return result
  val pow = (n: Int) => n * n
  println ( pow(5) )

  // take two parameters, return result
  val add = (a : Int, b: Int) => a + b
  println ( add(10, 20) )

}