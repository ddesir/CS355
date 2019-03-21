// Example of a static function of another class
class HelloWorld4 {

  public static void main(String[] args) {
    Greeting.sayHello();
  }
}

class Greeting {
  public static void sayHello() {
    System.out.println("***************");
    System.out.println("* Hello World! *");
    System.out.println("***************");
  }
}
