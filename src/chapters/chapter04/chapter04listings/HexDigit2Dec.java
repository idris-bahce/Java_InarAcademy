package chapters.chapter04.chapter04listings;

import java.util.Scanner;

public class HexDigit2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hexString = input.nextLine();

		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		char ch = hexString.charAt(0);
		if ('F'>=ch  && ch >= 'A') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch + " is " + value);
		} else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is " + ch);
		} else {
			System.out.println(ch + " is an invalid input");
		}
	}

}
