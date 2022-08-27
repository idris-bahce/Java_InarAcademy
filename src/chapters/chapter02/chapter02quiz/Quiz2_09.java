package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter starting velocity: ");
		double v0 = input.nextDouble();
		
		System.out.println("Please enter ending velocity: ");
		double v1 = input.nextDouble();
		
		System.out.println("Please enter time span: ");
		double t = input.nextDouble();
		
		double averageAcceleration = (v1 - v0) / t;
		System.out.println("The average acceleration is " + averageAcceleration);
	}

}
