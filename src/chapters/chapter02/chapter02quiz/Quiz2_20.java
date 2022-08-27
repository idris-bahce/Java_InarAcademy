package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = in.nextDouble();
		double interestRate = in.nextDouble();
		
		double interest = balance * (interestRate / 1200);
		System.out.println("The interest is " + interest);
	}

}
