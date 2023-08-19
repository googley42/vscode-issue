package foo

object Main extends App {
  def fooLocal: Int = 10

  // types derived by IDE auto completion
  val x1: Any = fooInPackage 
  val x2: Int = fooLocal
  val x3: Int = FooModule.fooInModule

  println("Hello, World!")
}
