// Example of an instance function
class HelloWorld3 {

  public static void sayHello() {
    System.out.println("***************");
    System.out.println("* Hello World! *");
    System.out.println("***************");
  }

  public static void main(String[] args) {
    HelloWorld3 greeting = new HelloWorld3();
    greeting.sayHello();
  }
}
