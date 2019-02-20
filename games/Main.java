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
				for (int i = 0; i < ask.length)
				break;
			default:
				System.out.println("You've entered an invalid choice.\nChoose again: ");
				choice = in.nextInt();
				break;
		}
				
	}
}