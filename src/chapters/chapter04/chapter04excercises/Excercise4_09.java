package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter:");
		String str = in.next();
		
		char x = str.charAt(0);
		System.out.println("The Unicode for the character " + str + " is " + (int)x);		
		
	}

}
