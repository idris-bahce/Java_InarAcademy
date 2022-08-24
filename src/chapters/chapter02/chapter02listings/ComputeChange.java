package chapters.chapter02.chapter02listings;

import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a decimal number: (e.g:11.56)");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		int dolars = (remainingAmount /100);
		System.out.println("Here is the amount of dolars: " + dolars);
		
		int quarters = (int)(remainingAmount % 100);
		System.out.println("Here is the amount of quarters: " + quarters / 25);
		
		int dimes = quarters % 25;
		System.out.println("Here is the amount of dimes: " + dimes / 10);
		
		int nickels = dimes % 10;
		System.out.println("Here is amount of nickels: " + nickels / 5);
		
		int pennies = nickels % 5;
		System.out.println("Here is the amount of pennies: " + pennies);
	}

}
