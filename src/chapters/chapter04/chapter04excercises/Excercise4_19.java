package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN: ");
		String isbn = in.nextLine();
		
		int ch1 = isbn.charAt(0)-'0';
		int ch2 = isbn.charAt(1)-'0';
		int ch3 = isbn.charAt(2)-'0';
		int ch4 = isbn.charAt(3)-'0';
		int ch5 = isbn.charAt(4)-'0';
		int ch6 = isbn.charAt(5)-'0';
		int ch7 = isbn.charAt(6)-'0';
		int ch8 = isbn.charAt(7)-'0';
		int ch9 = isbn.charAt(8)-'0';

		int ch10 = (ch1 + ch2 * 2 + ch3 * 3 + ch4 * 4 + ch5 * 5 + ch6 * 6 + ch7 * 7 + ch8 * 8 + ch9 * 9) % 11;

		if (ch10 == 10) {
			System.out.println("X");
		} else {
			System.out.println(ch10);
		}

	}

}
