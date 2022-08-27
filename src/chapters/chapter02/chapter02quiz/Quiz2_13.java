package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double value = input.nextDouble();
		
		double value1 = value * (1 + 0.00417);
		double value2 = (100 + value1) * (1 + 0.00417);
		double value3 = (100 + value2) * (1 + 0.00417);
		double value4 = (100 + value3) * (1 + 0.00417);
		double value5 = (100 + value4) * (1 + 0.00417);
		double value6 = (100 + value5) * (1 + 0.00417);
		
		System.out.println("After the sixth month, the account value is " + (int)(value6 * 100) / 100.0);
	}

}
