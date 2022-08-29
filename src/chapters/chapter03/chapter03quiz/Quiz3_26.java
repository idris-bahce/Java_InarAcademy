package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_26 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int x = in.nextInt();
		boolean condition1= (x % 5 == 0) && (x % 6 == 0);
		boolean condition2= (x % 5 == 0) || (x % 6 == 0);
		boolean condition3= (x % 5 == 0) ^ (x % 6 == 0);

		System.out.println("Is " + x + " divisable by 5 and 6: " + condition1);
		System.out.println("Is " + x + " divisable by 5 or 6: " + condition2);
		System.out.println("Is " + x + " divisable by 5 or 6, but not both: " + condition3);
	
	}

}
