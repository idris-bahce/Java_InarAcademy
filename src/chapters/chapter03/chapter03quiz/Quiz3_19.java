package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the lenght of three edge: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		double p = a + b + c;

		if (a + b > c) {
			System.out.println("Perimeter is: " + p);
			if (a + c > b) {
				System.out.println("Perimeter is: " + p);
				if (b + c > a) {
					System.out.println("Perimeter is: " + p);
				}
			}
		} else
			System.out.println("You entered invalid input.");
	}

}
