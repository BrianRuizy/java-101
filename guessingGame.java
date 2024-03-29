package ifPractice;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int theNumber = rand.nextInt(1000) + 1; // store random number as 'theNumber'
		boolean winner = false;
			
		int counter = 0;
		
		while (winner == false) {// keeps looping until correct guess 
			
			System.out.print("Enter your guess (0 - 1000): "); // ask user for guess
			int guess = input.nextInt(); // store user input as 'guess'
			input.nextLine(); // clearing buffer
			counter +=1;
			
			
			if (guess > theNumber)
				System.out.println("Too high");
			
			if (guess < theNumber)
				System.out.println("Too low");
				
			if (guess == theNumber) {
				System.out.print("WE HAVE A WINNER!!!\n");
				System.out.print("It took you: " + counter + " tries.");
				winner = true; 
			}
				
			else {
				System.out.println("Try again...\n");
			}		
			
		} // break while loop
		
	
		input.close();	
	} // end of main
		

} // end if class
