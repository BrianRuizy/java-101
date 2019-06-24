/* Grades average calculator
 * Brian Ruiz - 06/24/2019
 */
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// ask user for array size
		int size; 
		System.out.print("How many grades do you have: ");
		size = input.nextInt();
		input.hasNextLine(); // clears input buffer
		
		
		// Create an array for grades, of dynamic user size
		double[] grades =  new double [size];
		System.out.println("\nEnter the " + size + " grades... ");
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Grade #" + (i+1) + ": ");
			grades[i] = input.nextInt();
		}
		
		// calculate average
		double sum = 0;
		int count = 0;
		
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
			count++;
		}
		double average = (sum/count);
		
		// print the average
		System.out.println("\n"
				+ "Average: " + average);
		
		
		input.close();
	}

}
