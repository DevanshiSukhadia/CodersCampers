import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		
		//Generate random number 

		Random r = new Random();
		number = r.nextInt(100) + 1;
		System.out.println(number);

		// ask user to pick a number
		System.out.println("Pick a number between 1 and 100: ");
		int inputNumber = input.nextInt();

		if (inputNumber <= 100) {
			if (inputNumber == number) {
				System.out.println("you have picked correct number!");
				
			} 
			else if (inputNumber > number) {
				
				for (int i = 0; i <= 5; i++) {
					
					System.out.println("pick a lower number: \n");
					
					int number1 = input.nextInt();
					
					if (number1 == number) {
						System.out.println("you have picked correct number!");
						break;
					} else {
						System.out.println("You lose, the number to guess was Number: " + number);
						break;
					} // END OF IF STATEMENT
					
				} // END OF FOR LOOP
				
			} // END OF WHILE LOOP 
			else if (inputNumber < number) {
				
				for (int i = 0; i <= 5; i++) {
					System.out.println("pick a Higher number: \n");
				
					int number1 = input.nextInt();
					if (number1 == number) {
						System.out.println("you have picked correct number!");
						break;
					} else {
						System.out.println("You lose, the number to guess was Number: " + number);
						break;
					}

				} // END OF FOR LOOP
			} // END OF WHILE LOOP
		} 
		else {
			System.out.println("Your guess is not between 1 and 100, please try again");
		}

	} // END OF MAIN METHOD
}// END OF NUMBER CLASS
