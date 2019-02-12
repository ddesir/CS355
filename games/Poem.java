import java.util.*;
import java.lang.*;
import java.io.*;

class Poem {
  public static void main(String[] args) {
    System.out.println("What is your name?");
    Scanner in = new Scanner(System.in);
    String username = in.next();

    System.out.println("My student " + username + ",\nstanding proud,\nis a fine example for the crowd.");
  }
}
