import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {

  public static int getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your guess: ");
    int input = scanner.nextInt();
    return input;    
  }

  public static void main (String[] args) {
    Random random = new Random();

    int number = (int)(random.nextInt(100 + 1));
    int guess = getInput();

    while (guess != number) {
      if (guess < number) {
        System.out.println("Guess was too low");
        guess = getInput();
      } else if (guess > number) {
        System.out.println("Guess was too high");
        guess = getInput();
      } else {
        break;
      }
    }
    System.out.println("Correct, the number was " + number);
  }
}
