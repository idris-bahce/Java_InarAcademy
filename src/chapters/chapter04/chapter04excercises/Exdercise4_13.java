package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Exdercise4_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String str = in.next();
		
		String str1 = str.toUpperCase();
		char ch =str1.charAt(0);
		
		if( ch>'Z' || 'A'>ch) {
			System.out.println("You entered invalid character.");
		}else if('A'==ch||'E'==ch||'I'==ch||'O'==ch||'U'==ch) {
			System.out.println(ch + " is a vowel.");
		}else {
			System.out.println(ch + " is consonant.");
		}
	}

}
