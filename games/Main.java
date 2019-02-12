import java.util.*;

class Main extends Games {
	public static void main(String [] args) {
		String output = "";
		System.out.print(
			"WELCOME\n" +
			"1 - Poem\n" +
			"2 - Fortune Teller\n" +
			"3 - MadLibs\n\n" +
			"Choose a game: ");
		
		int choice = in.nextInt();
		// System.out.println(fortune_teller());
		
		if (choice == 1) {
			output = poem();
		} else if (choice == 2) {
			output = guessing_game();
		} else if (choice == 3) {
			output = fortune_teller();
		} else if (choice == 4) {
			output = madlibs();
		} else {
			System.out.println("You've entered an invalid choice.\nChoose again: ");
			choice = in.nextInt();
		}
		
		System.out.println(output);
				
	}
}