package chapters.chapter03.chapter03checkpoints;

import java.util.Scanner;

public class CheckPoint3_19 {
	public static void main(String[] args) {
		boolean num = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100: ");
		int x = input.nextInt();

		if (1 < x && x < 100) {
			System.out.println(num);
		} else {
			System.out.println(!num);
		}
		boolean numb = true;
		System.out.println("Enter a number between1 and 100 or a negative number: ");
		int y = input.nextInt();

		if ((1 < y && y < 100) || y < 0) {
			System.out.println(numb);
		}else {
			System.out.println(!numb);
		}

	}

}
