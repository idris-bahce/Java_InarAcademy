package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excerxise4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN :");
		String ssn = input.next();
		int x = ssn.length();

		if (x != 11) {
			System.out.println(ssn + "is an invalid social security number");
		} else {
			char ch1 = ssn.charAt(0);
			char ch2 = ssn.charAt(1);
			char ch3 = ssn.charAt(2);
			char ch4 = ssn.charAt(3);
			char ch5 = ssn.charAt(4);
			char ch6 = ssn.charAt(5);
			char ch7 = ssn.charAt(6);
			char ch8 = ssn.charAt(7);
			char ch9 = ssn.charAt(8);
			char ch10 = ssn.charAt(9);
			char ch11 = ssn.charAt(10);

			if (Character.isDigit(ch1) && Character.isDigit(ch2) && Character.isDigit(ch3) && ch4 == '-'
					&& Character.isDigit(ch5) && Character.isDigit(ch6) && ch7 == '-' && Character.isDigit(ch8)
					&& Character.isDigit(ch9) && Character.isDigit(ch10) && Character.isDigit(ch11)) {
				System.out.println(ssn + " is a valid social security number");
			} else
				System.out.println(ssn + "is an invalid social security number");
		}

	}

}
