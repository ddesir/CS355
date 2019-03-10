import java.util.*;
import java.lang.*;
import java.io.*;

class Games {
	static Random random = new Random();
	
	public Games() {
		
	}
	
	// Poem
	public static String poem(String name) {
		return "My student " + name + ",\nstanding proud,\nis a fine example for the crowd.";
	}
	
	// Guessing Game
	public static String guessing_game(int guess) {
		Scanner in = new Scanner(System.in);
		int number = (int)(random.nextInt(100 + 1));
		
		while (guess != number) {
			String not_equal = (guess > number) ? "Guess was too high" : "Guess was too low";
			System.out.print(not_equal + "\nGuess again: ");
			guess = in.nextInt();
    }

    return "Correct, the number was " + number;
	}
	
	// Fortune Teller
	public static String fortune_teller(String name) {
		String[] fortunes = {
      "You're not successful unless you have a few haters.",
      "Be present in the moment.", "Nothing is consistent but change.",
      "The ends will justify the means.", "Things change. Friends leave." +
      "Life doesn't stop for anybody."
    };

    int number = (int)(random.nextInt(fortunes.length));
    
    return "Here is your fortune " + name + ":\n" + fortunes[number];
	}
	
	// Madlibs
	public static String madlibs(String [] arr) {
		String adj1 = arr[0];
		String pnoun1 = arr[1];
		String num1 = arr[2];
		String pnoun2 = arr[3];
		String adj2 = arr[4];
		String adv1 = arr[5];
		String adj3 = arr[6];
		String noun1 = arr[7];
		String verb = arr[8];
		String body_part1 = arr[9];
		
		String lets_dance = 
				"At my %s sleepover party, my best %s and I decided to have a dance-off. We made my %s-year-old little sister be the judge. We broke into two teams, \"The %s\" and \"The %s Dancers.\" My team danced %s, but the other team's %s moves were out of this %s! They totally out-%s us. So when no one was looking, I grabbed my sister by the %s and pulled her aside. ...";
			
			return String.format(lets_dance, adj1, pnoun1, num1, pnoun2, adj2, adv1, adj3, noun1, verb, body_part1);
	}



}
