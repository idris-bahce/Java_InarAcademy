package chapters.chapter03.chapter03checkpoints;

import java.util.Scanner;

public class CheckPoint3_20 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = input.nextInt();
		int a = x - 5;
		
		boolean answer = true;
		if((a < 4.5) || (a> -4.5)) {
			System.out.println(answer);
		}else {
			System.out.println(!answer);
		}
		System.out.println("Enter a number: ");
		int y = input.nextInt();
		int b = (y - 5);
		
		if(b > 4.5 || b < 4.5) {
			System.out.println(answer);
		}else {
			System.out.println(!answer);
		}
	}
	}


