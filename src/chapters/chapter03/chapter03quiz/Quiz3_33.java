package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_33 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter weight and price for package 1:");
		double pricePackage1 = in.nextDouble();
		double weightPackage1 = in.nextDouble();
		
		System.out.println("Enter weight and price for package 2:");
		double pricePackage2 = in.nextDouble();
		double weightPackage2 = in.nextDouble();
		
		double x = pricePackage1 * weightPackage1;
		double y = pricePackage2 * weightPackage2;
		
		if(x < y) {
			System.out.println("Package 1 is cheaper.");
		}else if (y < x) {
			System.out.println("Package 2 is cheaper.");
		}else
			System.out.println("They are same.");
	}

}
