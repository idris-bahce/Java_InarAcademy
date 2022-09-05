package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter:");
		String str = in.next();
		String str1 = str.toUpperCase();
		char ch = str1.charAt(0);
		
		if (ch=='A'||ch=='B'||ch=='C') {
			System.out.println("The corresponding number is 2");
		}else if (ch=='D'||ch=='E'||ch=='F') {
			System.out.println("The corresponding number is 3");
		}else if (ch=='G'||ch=='H'||ch=='I') {
			System.out.println("The corresponding number is 4");
		}else if (ch=='J'||ch=='K'||ch=='L') {
			System.out.println("The corresponding number is 5");
		}else if (ch=='M'||ch=='N'||ch=='O') {
			System.out.println("The corresponding number is 6");
		}else if (ch=='P'||ch=='Q'||ch=='R'||ch=='S') {
			System.out.println("The corresponding number is 7");
		}else if (ch=='T'||ch=='U'||ch=='V') {
			System.out.println("The corresponding number is 8");
		}else if (ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
			System.out.println("The corresponding number is 9");
		}else {
			System.out.println(str + " is an invalid input");
		}
	}
}
