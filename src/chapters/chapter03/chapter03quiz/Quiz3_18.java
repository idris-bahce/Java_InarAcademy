package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the weight of your package: ");
		double weightOfPackage = in.nextDouble();
		
		if(weightOfPackage<=1) {
			System.out.println("Shipping cost is $3.5");
		}else if(weightOfPackage<=3) {
			System.out.println("Shipping cost is $5.5");
		}else if(weightOfPackage<=10) {
			System.out.println("Shipping cost is $8.5");
		}else if(weightOfPackage<=20) {
			System.out.println("Shipping cost is $10.5");
		}else {
			System.out.println("Because of weight "
					+ "package cannot be shipped.");
		}
	}

}
