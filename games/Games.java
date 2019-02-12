import java.util.*;
import java.lang.*;
import java.io.*;

class Games {
	static Random random = new Random();
	static Scanner in = new Scanner(System.in);
	static String name;
	static int guess;
	
	public Games() {
		
	}
	
	public static String get_name() {
		return name;
	}
	
	public static void set_name() {
		name = in.nextLine();
	}
	
	public static void set_guess() {
		guess = in.nextInt();
	}
	
	public static int get_guess() {
		return guess;
	}
	
	// Poem
	public static String poem() {
		System.out.println("What is your name? ");
		set_name();
		return "My student " + get_name() + ",\nstanding proud,\nis a fine example for the crowd.";
	}
	
	// Guessing Game
	public static String guessing_game() {
		int number = (int)(random.nextInt(100 + 1));
		System.out.print("Enter your guess: ");
    set_guess();

    while (guess != number) {
      if (guess < number) {
        System.out.println("Guess was too low");
        set_guess();
      } else if (guess > number) {
        System.out.println("Guess was too high");
        set_guess();
      } else {
        break;
      }
    }
    return "Correct, the number was " + number;
	}
	
	// Fortune Teller
	public static String fortune_teller() {
		String[] fortunes = {
      "You're not successful unless you have a few haters.",
      "be present in the moment.", "Nothing is consistent but change.",
      "The ends will justify the means.", "Things change. Friends leave." +
      "Life doesn't stop for anybody."
    };

    int index = (int)(random.nextInt(fortunes.length - 1));
    System.out.print("Enter your name: ");
    set_name();
    
    return "Here is your fortune " + get_name() + ":\n" + fortunes[index];
	}
	
	// Madlibs
	public static String madlibs() {
		String lets_dance = 
			"At my {adj1} sleepover party, my best {pnoun1} and I decided to have a dance-off. We made my {num1}-year-old little sister be the judge. We broke into two teams, \"The {pnoun2}\" and \"The {adj2} Dancers.\" My team danced {adv1}, but the other team's {adj3} moves were out of this {noun1}! They totally out-";
			
			return "";
	}


}
