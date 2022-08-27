package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kg: ");
		double kgWater = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double Q ;
		Q = kgWater * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is: "+ Q);
		
	}

}
