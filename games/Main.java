import java.util.*;

class Main extends Games {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args) {
		String output = "";
		System.out.print(
			"WELCOME\n" +
			"1 - Poem\n" +
			"2 - Guessing Game\n" +
			"3 - Fortune Teller\n" +
			"4 - MadLibs\n\n" +
			"Choose a game: ");
		
		int choice = in.nextInt();
		
		switch (choice){
			// Poems Game
			case 1:
				System.out.println("What is your name? ");
				set_name();
				System.out.print(poem());
				System.out.println("\n");
				break;
			// Guessing Game
			case 2:
				System.out.print("Enter your guess: ");
				set_guess();
    		
				System.out.print(guessing_game());
				System.out.println("\n");
				break;
			// Fortune Teller Game
			case 3:
				System.out.print("Enter your name: ");
				set_name();
				System.out.print(fortune_teller());
				System.out.println("\n");
				break;
			// Madlibs Game
			case 4:
				String [] ask = {"Enter an adjective: ", "Enter a plural noun: ",
				"Enter a number: ", "Enter a plural noun: ", "Enter an adjective: ",
				"Enter an adverb: ", "Enter an adjective: ", "Enter a noun: ",
				"Enter a verb: ", "Enter a body part: "};
				
				String[] response = new String[ask.length];
				
				for (int i = 0; i < ask.length; i++) {
					System.out.println(ask[i]);
					response[i] = in.next();
				}
				
				System.out.print(madlibs(response));
				System.out.println("\n");
				break;
			default:
				System.out.println("You've entered an invalid choice.\nChoose again: ");
				choice = in.nextInt();
				break;
		}
				
	}
}