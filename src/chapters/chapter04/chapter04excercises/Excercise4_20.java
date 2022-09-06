package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		
		System.out.println("This string has " + str.length()+ " characters."
				+ "\n And the first letter of your string is " + str.charAt(0));
	}

}
