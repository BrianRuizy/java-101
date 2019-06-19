
import java.util.Scanner;

public class Car {
	 
	// defining class variables
	double odometer = 0; // Miles driven
	double gasTank; // Gas left
	double GASMAX = 12; // Max capacity of car
	double MPG = 25; 
	String color = "Suzuka Blue"; 
	
	// default constructor
	public Car() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What color paint job would you like?");
		color = input.nextLine();
		
		System.out.println("How big is the gas tank? (Gallons)");
		GASMAX = input.nextInt();
		input.nextLine(); // To clear the input buffer
		
		input.close();
	}
	
	// parameter constructor
	public Car(String in_color, double in_gas, double in_mpg) {
		color = in_color;
		GASMAX = in_gas; 
		gasTank = GASMAX; 
		MPG = in_mpg;
		odometer = 0;
	}
	
	public void drive(double miles) {
		odometer += miles; 
		
		double gasUsed = (miles / MPG); 
		gasTank -= gasUsed;
		
		System.out.print("\nYou drove " + miles + " miles!\n"); 
		System.out.println("And, used " + gasUsed + " gallons.\n"); 
	} // end of drive method
	
	public void fillUp() {
		gasTank = GASMAX;
	} // end of fillUp method
	
	public void printStatus() {	
		System.out.println("Car color: " + color);
		System.out.println("Driven miles: " + odometer);
		System.out.println("Gas: " + gasTank + " gallons\n");
	} // end of printStatus method
	
} // end of Car class
