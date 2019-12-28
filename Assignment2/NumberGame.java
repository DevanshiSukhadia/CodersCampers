import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int number;
		int tries = 5;
		boolean win = false;

		Scanner input = new Scanner(System.in);

		// Generate random number

		Random r = new Random();
		number = r.nextInt(100) + 1;
		// print random number
		System.out.println("Random number is: " +number);

		// ask user to pick a number
		System.out.println("Pick a number between 1 and 100: ");

		while (win == false && tries > 0) {

			int guess = input.nextInt();
			tries--;

			if (tries == 0) {
				System.out.println("Correct number is: " + number);
				break;
			} // END OF TRIES IF

			if (guess <= 100) {

				if (guess == number) {
					win = true;
					System.out.println("you have picked correct number!");

				} else if (guess > number) {
					System.out.println("Pick lower number: ");

				} else if (guess < number) {
					System.out.println("Pick higher number");

				}

			} // END OF GUESS IF
			else {
				System.out.println("Your guess is not between 1 and 100, please try again");

			}
		} // END OF WHILE LOOP

	} // END OF MAIN METHOD
}// END OF NUMBER CLASS
