package chapters.chapter03.chapter03checkpoints;

import java.util.Scanner;

public class CheckPoint3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100: ");
		int x = input.nextInt();

		if (1 < x && x < 100) {
			System.out.println(1 < x && x < 100);
		} else {
			System.out.println(1 < x && x < 100);
		}
		System.out.println("Enter a number between1 and 100 or a negative number: ");
		int y = input.nextInt();

		if ( y < 0 ||(1 < y && y < 100)) {
			System.out.println(y < 0 ||(1 < y && y < 100));
		}else {
			System.out.println(y < 0 ||(1 < y && y < 100));
		}

	}

}
