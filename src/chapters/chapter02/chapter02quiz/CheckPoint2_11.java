package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class CheckPoint2_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of the years: ");
		int population1 = input.nextInt();
		
		int population0 = 312_032_486;
		int yearPerBirth = 31_536_000 / 7;
		int deathPerYear = 31536000 / 13;
		int newImmigrant = 31536000 /45;
		
		int result = population0 + (yearPerBirth * population1 - deathPerYear * population1 + newImmigrant * population1);
		System.out.println("The population in " + population1 + " years is " + result);
	}

}
