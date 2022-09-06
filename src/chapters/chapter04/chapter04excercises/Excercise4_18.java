package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two characters:");
		String status = in.nextLine();
		status = status.toUpperCase();
		char major = status.charAt(0);
		char character = status.charAt(1);

		switch (character) {
		case '1':
			if (major == 'M') {
				System.out.println("Mathematics freshman");
			} else if (major == 'C') {
				System.out.println("Computer Science freshman");
			} else if (major == 'I') {
				System.out.println("Information Technology freshman");
			} else {
				System.out.println("Invalid input!");
			}
			break;
		case '2':
			if (major == 'M') {
				System.out.println("Mathematics sophomore");
			} else if (major == 'C') {
				System.out.println("Computer Science sophomore");
			} else if (major == 'I') {
				System.out.println("Information Technology sophomore");
			} else {
				System.out.println("Invalid input!");
			}
			break;
		case '3':
			if (major == 'M') {
				System.out.println("Mathematics junior");
			} else if (major == 'C') {
				System.out.println("Computer Science junior");
			} else if (major == 'I') {
				System.out.println("Information Technology junior");
			} else {
				System.out.println("Invalid input!");
			}
			break;
		case '4':
			if (major == 'M') {
				System.out.println("Mathematics senior.");
			} else if (major == 'C') {
				System.out.println("Computer Science senior.");
			} else if (major == 'I') {
				System.out.println("Information Technology senior.");
			} else {
				System.out.println("Invalid input!");
			}
			break;
		default:
			System.out.println("Invalid input!!");
		}

	}
}
