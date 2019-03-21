import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main (String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int number = (int)(random.nextInt(100 + 1));
    System.out.print("Enter your guess: ");
    int guess = scanner.nextInt();

    if (guess < number) {
      System.out.println("Guess was too low");
    } else if (guess > number) {
      System.out.println("Guess was too high");
    } else {
      System.out.println("Correct, the number was " + number);
    }
  }
}
