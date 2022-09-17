package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double sum = 0;
		double sumSquare = 0;
		System.out.println("Enter ten numbers: ");
		for (int i = 1; i <= 10; i++) {
			double num = input.nextDouble();
			sum += num;
			sumSquare = num * num;
		}
		double mean = sum / 10;
		System.out.println("The mean is " + mean);

		double deviation = Math.sqrt((sumSquare - ((sum * sum) / 10)) / 9);
		System.out.println("The standard deviation is " + deviation);

	}
}
