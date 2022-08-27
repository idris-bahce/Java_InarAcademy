package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amountInvestment = in.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		double interestRate= in.nextDouble();
		
		System.out.println("Enter number of years: ");
		double years = in.nextDouble();
		
		double futureInvestmentValue = amountInvestment * Math.pow((1 + interestRate), years * 12);
		
		years *= 12;
		interestRate /= 1200;
		
		
		System.out.println("Accumulated value is: " + futureInvestmentValue);
	}
	

}
