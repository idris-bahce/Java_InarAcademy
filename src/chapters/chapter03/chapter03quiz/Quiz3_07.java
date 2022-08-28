package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_07 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a decimal number: (e.g:11.56)");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		int dolars = (remainingAmount /100);
		
		int quarters = (int)(remainingAmount % 100);
		
		int quarter = quarters / 25;
		
		int nickels = (quarters % 25) / 5;
		
		int pennies = (quarters % 25) % 5;
		
		
		
		
		System.out.println("You have " + dolars + " dolars, " + quarter + " quarters, "
				+ nickels + " nickels and " + pennies + " pennies.");
	}



}
