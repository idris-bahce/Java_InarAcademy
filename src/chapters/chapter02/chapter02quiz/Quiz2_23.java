package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the driving distance:");
		double distance = in.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = in.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = in.nextDouble();
		
		
		double result = (distance / milesPerGallon) * pricePerGallon;
		System.out.println("The cost of driving is: " + result);
	}

}
