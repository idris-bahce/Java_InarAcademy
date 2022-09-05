package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a hex digit:");
		String hexString = in.next();
		String hexUpper = hexString.toUpperCase();
		
		if(hexString.length()!=1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		char ch = hexUpper.charAt(0);
		if('A'<=ch && ch<='F') {
			int value = ch -'A' + 2;
			System.out.println("The binary value for hex digit " + ch + " is " + value);
		}else if (Character.isDigit(ch)) {
			System.out.println("The binary value for hex digit " + ch + " is " + ch);
		}else if (Character.isDigit(ch)) {
			System.out.println("The binary value for hex digit " + ch + " is " + ch);
		}
	}

}
