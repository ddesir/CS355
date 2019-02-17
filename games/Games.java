import java.util.*;
import java.lang.*;
import java.io.*;

class Games {
	static Random random = new Random();
	static String name;
	static int guess;
	
	public Games() {
		
	}
	
	public static String get_name() {
		return name;
	}
	
	public static void set_name() {
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
	}
	
	public static void set_guess() {
		Scanner in = new Scanner(System.in);
		guess = in.nextInt();
	}
	
	public static int get_guess() {
		return guess;
	}
	
	// Poem
	public static String poem() {
		return "My student " + get_name() + ",\nstanding proud,\nis a fine example for the crowd.";
	}
	
	// Guessing Game
	public static String guessing_game() {
		int number = (int)(random.nextInt(100 + 1));
		guess = get_guess();
		
		while (get_guess() != number) {
			String not_equal = (guess > number) ? "Guess was too high" : "Guess was too low";
			System.out.print(not_equal + "\nGuess again: ");
			set_guess();
    }

    return "Correct, the number was " + number;
	}
	
	// Fortune Teller
	public static String fortune_teller() {
		String[] fortunes = {
      "You're not successful unless you have a few haters.",
      "Be present in the moment.", "Nothing is consistent but change.",
      "The ends will justify the means.", "Things change. Friends leave." +
      "Life doesn't stop for anybody."
    };

    int number = (int)(random.nextInt(fortunes.length - 1));
    
    return "Here is your fortune " + get_name() + ":\n" + fortunes[number];
	}
	
	// Madlibs
	/* 
public static String madlibs(String adj1, String pnoun1, int num1, String pnoun2, String adj2, String adv1, String adj3, String noun1, String verb, String body_part1, String person, String adj4, int num2, String body_part2, String adv2, String adj5, String pnoun3, String adv3, String pnoun4, String noun2, String body_part3) {
		String adj1;
		String pnoun1;
		int num1;
		String pnoun2;
		String adj2;
		String adv1;
		String adj3;
		String noun1;
		String verb;
		String body_part1;
		String person;
		String adj4;
		int num2;
		String body_part2;
		String adv2;
		String adj5;
		String pnoun3;
		String adv3;
		String pnoun4;
		String noun2;
		String body_part3;
		
		String lets_dance = 
			"At my #{adj1} sleepover party, my best #{pnoun1} and I decided to have a dance-off. We made my #{num1}-year-old little sister be the judge. We broke into two teams, \"The #{pnoun2}\" and \"The #{adj2} Dancers.\" My team danced #{adv1}, but the other team's #{adj3} moves were out of this #{noun1}! They totally out-#{verb} us. So when no one was looking, I grabbed my sister by the #{body_part1} and pulled her aside. \"#{person},\" I whispered, \"I promise to do all of your #{adj4} chores for #{num2} months if you say that my team won.\" My sister shook her #{body_part2}. \"No way!\" she said #{adv2}. \"Your team danced worse than a bunch of #{adj5} #{pnoun3}!\" \"Fine,\" I said. \"Then I'll just have to tell all of my friends that you're #{adv3} afraid of #{pnoun4}.\" That helped to change her #{noun2}. We won that contest, #{body_part3} down!";
			
			System.out.println("Enter an adjective: ");
			adj1 = in.next();
			
			System.out.println("Enter an plural noun: ");
			pnoun1 = in.next();
			
			System.out.println("Enter an number: ");
			num1 = in.nextInt();
			
			System.out.println("Enter an plural noun: ");
			pnoun2 = in.next();
			
			System.out.println("Enter an adjective: ");
			adj2 = in.next();
			
			System.out.println("Enter an adverb: ");
			adv1 = in.next();
			
			System.out.println("Enter an adjective: ");
			adj3 = in.next();
			
			System.out.println("Enter an noun: ");
			noun1 = in.next();
			
			System.out.println("");
			verb = in.next();
			
			System.out.println("");
			body_part1 = in.next();
			
			System.out.println("");
			person = in.next();
			
			System.out.println("Enter an adjective: ");
			adj4 = in.next();
			
			System.out.println("Enter an number: ");
			num2 = in.nextInt();
			
			System.out.println("");
			body_part2 = in.next();
			
			System.out.println("Enter an adverb: ");
			adv2 = in.next();
			
			System.out.println("Enter an adjective: ");
			adj5 = in.next();
			
			System.out.println("Enter an plural noun: ");
			pnoun3 = in.next();
			
			System.out.println("Enter an adverb: ");
			adv3 = in.next();
			
			System.out.println("Enter an plural noun: ");
			pnoun4 = in.next();
			
			System.out.println("Enter an noun: ");
			noun2 = in.next();
			
			System.out.println("");
			body_part3 = in.next();
			
			return String.format(lets_dance, adj1, pnoun1, num1, pnoun2, adj2, adv1, adj3, noun1, verb, body_part1, person, adj4, num2, body_part2, adv2, adj5, pnoun3, adv3, pnoun4, noun2, body_part3);
	}
 */


}
