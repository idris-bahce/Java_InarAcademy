package chapters.chapter03.chapter03checkpoints;

import java.util.Scanner;

public class CheckPoint3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		int score = input.nextInt();
		
		if (score>90) {
			System.out.println( "Pay is: " + (1.03 * score));
	}
		

}}
