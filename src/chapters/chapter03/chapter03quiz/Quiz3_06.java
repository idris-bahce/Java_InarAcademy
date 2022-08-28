package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_06 {
	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter your weight in pound: ");
			double pound =input.nextDouble();
			System.out.println("Enter your height in feet: ");
			double feet =input.nextDouble();
			System.out.println("Enter your height in inch: ");
			double inch =input.nextDouble();
			double weight = pound * 0.45359237;
			double height = (feet * 0.3048) + (inch * 0.0254);
			
			
			double bmi;
			bmi = weight/(height * height);
			System.out.println(bmi);
			if(bmi<18.5) {
				System.out.println("You are underweight.");
			}else if(bmi<25.0) {
				System.out.println("You are normal.");
			}else if(bmi<30) {
			System.out.println("You are overweight.");
			}else {
				System.out.println("You are obese.");
			}
			
		


	}

}
