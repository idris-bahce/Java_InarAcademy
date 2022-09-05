package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15):");
		int value = in.nextInt();
		
		if (value < 10 && value >=0) {
			System.out.println("The hex value is " + value);
		}else if (value == 10) {
			System.out.println("The hex value is A");
		}else if(value == 11) {
			System.out.println("The hex value is B");
		}else if (value == 12) {
			System.out.println("The hex value is C");
		}else if(value == 13) {
			System.out.println("The hex value is D");
		}else if (value == 14) {
			System.out.println("The hex value is E");
		}else if(value == 15) {
			System.out.println("The hex value is F");
		}else
			System.out.println(value + " is an invalid input.");
		}
		
	}


