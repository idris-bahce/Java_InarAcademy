package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a three digit integer: ");
		int x = in.nextInt();
		
		int digit100 = x /100;
		int digit10 = (x / 10) % 10;
		int digit1 = (x % 10);
		
		if(digit1 == digit100) {
			System.out.println(x + " is a palindrome.");
		}else {
			System.out.println(x + " is not a apaindrome.");
		}
	}



}
