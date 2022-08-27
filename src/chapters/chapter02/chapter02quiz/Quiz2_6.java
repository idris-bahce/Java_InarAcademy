package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit number: ");
		int x =input.nextInt();
		
		int hunderts = x / 100;
		int tens = (x / 10) % 10;
		int ones = (x % 100) % 10;
		int y = ones + tens + hunderts;
		
		System.out.println("The sum of the digits is " + y);
	}

}
