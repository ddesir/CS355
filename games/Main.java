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
		// System.out.println(fortune_teller());
		
		/* 
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
 */
		
		switch (choice){
			case 1:
				System.out.println("What is your name? ");
				set_name();
				System.out.print(poem());
				System.out.println("\n");
				break;
			case 2:
				System.out.print("Enter your guess: ");
				set_guess();
    		
				System.out.print(guessing_game());
				System.out.println("\n");
				break;
			case 3:
				 System.out.print("Enter your name: ");
				 set_name();
				 System.out.print(fortune_teller());
				 System.out.println("\n");
			case 4:
				break;
			default:
				System.out.println("You've entered an invalid choice.\nChoose again: ");
				choice = in.nextInt();
				break;
		}
				
	}
}