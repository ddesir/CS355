import java.util.*;

class Main {
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
			
		int choice = in.nextInt();		// int does not consume the last new line char
		in.nextLine();								// Workaround: Catches new line char
		
		switch (choice){
			// Poems Game
			case 1:
				System.out.println("What is your name? ");
				String name = in.nextLine();
				System.out.print(Games.poem(name));
				System.out.println("\n");
				break;
			// Guessing Game
			case 2:
				System.out.print("Enter your guess: ");
				int guess = in.nextInt();
    		
				System.out.print(Games.guessing_game(guess));
				System.out.println("\n");
				break;
			// Fortune Teller Game
			case 3:
				System.out.print("Enter your name: ");
				String name2 = in.nextLine();
				System.out.print(Games.fortune_teller(name2));
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
				
				System.out.print(Games.madlibs(response));
				System.out.println("\n");
				break;
			default:
				System.out.println("You've entered an invalid choice.\nChoose again: ");
				choice = in.nextInt();
				break;
		}
				
	}
}