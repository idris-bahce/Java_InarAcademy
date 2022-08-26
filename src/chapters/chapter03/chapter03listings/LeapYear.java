package chapters.chapter03.chapter03listings;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

		System.out.println(year + " is a leapyear? " + leapYear);

	}

}
