package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_31 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB:");
		double exchangeRate = in.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int convertType = in.nextInt();
		
		
		switch (convertType) {
		case 0:
			System.out.println("Enter the dollar aamount: ");
			double dollarAmount = in.nextDouble();
			double rmb= dollarAmount * exchangeRate;
			System.out.println("You have" + rmb + " Chinese RMB.");
		case 1:
			System.out.println("Enter the RMB amount: ");
			double rmbAmount = in.nextDouble();
			double dollars = rmbAmount / exchangeRate;
			System.out.println("You have" + dollars + " dollars.");
			
		}
	}

}
