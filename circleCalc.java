
import java.util.Scanner;

public class CircleCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// User input name 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Hello, " + name + "\nWelcome to the Circle Calculator!");
		
		// Variable declarations
		double radius, area;
		
		System.out.print("Enter a radius: ");
		radius = input.nextDouble();
		
		// Arithmetics
		area = Math.PI * Math.pow(radius, 2);
		     // 3.1415 * radius * radius; 
		
		// Results
		System.out.print("The area of the Circle with radius " + radius);
		System.out.print(" = " + area);
		
	}
	
}
