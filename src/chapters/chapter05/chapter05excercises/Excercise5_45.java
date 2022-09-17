package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_45 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ten intiger: ");
		double sum = 0;
		double mean = 0;
		double step1toDeviation = 0;
		double standartDeviation = 0;
		for (int i = 0; i < 10; i++) {
			double num = in.nextDouble();
			sum += num;
			mean = sum / 10;
			step1toDeviation += Math.pow(mean - num, 2);
		}

		standartDeviation = Math.sqrt(step1toDeviation);
		System.out.println("The mean is: " + mean);
		System.out.println("The standart deviation is: " + standartDeviation);
	}
}
//unfinished code