package chapters.chapter02.chapter02listings;

import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		double montlyInterestRate = annualInterestRate /1200;
		
		System.out.println("Enter the number off the years: ");
		int numberOfYears =input.nextInt();
		
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		double montlyPayment = loanAmount * montlyInterestRate / (1 - (1/Math.pow(1 + montlyInterestRate, numberOfYears * 12)));
		double totalPayment = montlyPayment * numberOfYears * 12;
		
		System.out.println("Montly payment is: $" + (int)(montlyPayment * 100) / 100.0);
		System.out.println("Total payment is: $" + (int)(totalPayment * 100) / 100.0);
		
		
	}


}
