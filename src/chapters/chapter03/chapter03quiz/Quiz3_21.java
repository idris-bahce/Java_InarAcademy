package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = in.nextInt();

		System.out.println("Enter month (1-12): ");
		int m = in.nextInt();

		System.out.println("Enter the day of the month (1-31): ");
		int q = in.nextInt();

		int k = year % 100;
		int j = year / 100;

		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

		switch (h) {
		case 0:
			System.out.println("Day of the week is saturday");
			break;
		case 1:
			System.out.println("Day of the week is sunday");
			break;
		case 2:
			System.out.println("Day of the week is monday");
			break;
		case 3:
			System.out.println("Day of the week is tuesday");
			break;
		case 4:
			System.out.println("Day of the week is wednesday");
			break;
		case 5:
			System.out.println("Day of the week is thursday");
			break;
		default:
			System.out.println("Day of the week is friday");
		}

	}

}
