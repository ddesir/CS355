// Example of an instance function of another class
class HelloWorld5 {

  public static void main(String[] args) {
    Greeting2 g = new Greeting2();
    g.sayHello();
  }
}

class Greeting2 {
  public static void sayHello() {
    System.out.println("***************");
    System.out.println("* Hello World! *");
    System.out.println("***************");
  }
}
