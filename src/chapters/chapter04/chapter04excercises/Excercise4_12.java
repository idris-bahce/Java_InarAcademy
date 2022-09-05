package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String s = in.next();
		String str = s.toUpperCase();
		char ch = str.charAt(0);

		if (ch == 0) {
			System.out.println("The binary value is 0000");
		} else if (ch == 1) {
			System.out.println("The binary value is 0001");
		} else if (ch == 2) {
			System.out.println("The binary value is 0010");
		} else if (ch == 3) {
			System.out.println("The binary value is 0011");
		} else if (ch == 4) {
			System.out.println("The binary value is 0100");
		} else if (ch == 5) {
			System.out.println("The binary value is 0101");
		} else if (ch == 6) {
			System.out.println("The binary value is 0110");
		} else if (ch == 7) {
			System.out.println("The binary value is 0111");
		} else if (ch == 8) {
			System.out.println("The binary value is 1000");
		} else if (ch == 9) {
			System.out.println("The binary value is 1001");
		} else if (ch == 'A') {
			System.out.println("The binary value is 1010");
		} else if (ch == 'B') {
			System.out.println("The binary value is 1011");
		} else if (ch == 'C') {
			System.out.println("The binary value is 1100");
		} else if (ch == 'D') {
			System.out.println("The binary value is 1101");
		} else if (ch == 'E') {
			System.out.println("The binary value is 1110");
		} else if (ch == 'F') {
			System.out.println("The binary value is 1111");
		} else {
			System.out.println("Invalid Input.");

		}
	}
}
