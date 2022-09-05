package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String str = in.next();
		String str1 = str.toUpperCase();
		
		char ch = str1.charAt(0);
		if(ch=='A') {
			System.out.println("The numeric value for grade A is 4");
		}else if(ch=='B') {
			System.out.println("The numeric value for grade B is 3");
		}else if(ch=='C') {
			System.out.println("The numeric value for grade C is 2");
		}else if(ch=='D') {
			System.out.println("The numeric value for grade D is 1");
		}else if(ch=='F') {
			System.out.println("The numeric value for grade F is 0");
		}else{
			System.out.println(str1 + " is an invalid grade");
		}
		
	
	
	}

}
