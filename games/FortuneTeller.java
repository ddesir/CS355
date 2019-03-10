import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {

  public static void main (String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    String[] fortunes = {
      "You're not successful unless you have a few haters.",
      "be present in the moment.", "Nothing is consistent but change.",
      "The ends will justify the means.", "Things change. Friends leave." +
      "Life doesn't stop for anybody."
    };

    int index = (int)(random.nextInt(fortunes.length));
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    
    System.out.println("Here is your fortune " + name + ":\n" + fortunes[index]);
  }
}
