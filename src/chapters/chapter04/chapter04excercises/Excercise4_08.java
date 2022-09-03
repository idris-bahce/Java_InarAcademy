package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an ASCII code(between 0 and 127): ");
		int code = in.nextInt();
		
	
			char x = (char)code;
			System.out.println("The character for ASCII code " + code + " is " + x);
		}
	}


