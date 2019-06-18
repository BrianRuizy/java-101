// Author: Brian Ruiz - 06/18/2019
// Program calculates for the length Hypotenuse
// given the lengths of opposite and adjacents of triangle

// pythagoreanTheorem == a^{2}+b^{2}=c^{2},

import java.util.Scanner;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of Opposite: ");
		double opposite = input.nextDouble();
		
		System.out.print("Enter length of Adjacent: ");
		double adjacent = input.nextDouble();
		
		double answer = getHypotenuse(opposite, adjacent);
		System.out.println("\nHypotenuse for opposite: " + opposite + ", and "
				+ "adjacent: " + adjacent + "\nEquals " + answer);
	
	}
	
	public static double  getHypotenuse(double opposite, double adjacent) {
		
		double hypotenuse = (Math.pow(opposite, 2) + Math.pow(adjacent,  2));
		hypotenuse = (Math.sqrt(hypotenuse));
		
		return hypotenuse;
	}
	
}
