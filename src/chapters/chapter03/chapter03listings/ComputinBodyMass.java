package chapters.chapter03.chapter03listings;

import java.util.Scanner;

public class ComputinBodyMass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		double weight =input.nextDouble();
		System.out.println("Enter your height: ");
		double height =input.nextDouble();
		
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
