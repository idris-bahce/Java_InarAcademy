package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class GuessNumberOneTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = (int) (Math.random() * 101);
		System.out.println("Guess a number between 0 and 100 inclusively.");
		int guess = in.nextInt();

		while (number != guess) {
			if (guess < number) {
				System.out.println("You entered smaller number.");
			} else {
				System.out.println("You entered bigger number.");
			}
			System.out.println("Guess a number between 0 and 100 inclusively.");
			guess = in.nextInt();
		}
		System.out.println("True!");
	}

}
