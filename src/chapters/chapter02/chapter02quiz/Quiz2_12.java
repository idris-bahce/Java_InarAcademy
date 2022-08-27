package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed: ");
		double v = input.nextDouble();
		
		System.out.println("Enter accelaration: ");
		double a = input.nextDouble();
		
		double length = (v * v) / (2 * a);
		
		System.out.println("The minimum runway length for this airplane is: " + length);
	}

}
