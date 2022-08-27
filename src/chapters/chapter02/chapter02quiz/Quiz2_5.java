package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		System.out.println("Enter a gratuity rate: ");
		double gratuity = input.nextDouble();
		
		double x = subtotal * (gratuity/100);
		double y = x + subtotal;
		System.out.println("The graduity is " + x + " and total is "+ y);
	}

}
