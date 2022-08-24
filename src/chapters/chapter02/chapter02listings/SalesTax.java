package chapters.chapter02.chapter02listings;
import java.util.Scanner;
public class SalesTax {
	public static void main(String[] args) {
		Scanner idris = new Scanner(System.in);
		
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = idris.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + 
		(int)(tax * 100) / 100.0);
	}

}
