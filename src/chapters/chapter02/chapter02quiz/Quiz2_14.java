package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double pound = input.nextDouble();
		double kg = pound * 0.45359237;
		
		System.out.println("Enter height in inches: ");
		double weight = input.nextDouble();
		double meters = weight * 0.0254;
		
		double bmi = kg / (meters * meters);
		System.out.println("BMI is: " +bmi);
	}

}
