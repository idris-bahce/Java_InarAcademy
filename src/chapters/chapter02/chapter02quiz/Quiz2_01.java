package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_01 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a celcius degree: ");
		double celcius = input.nextDouble();
		
		double fahrenheit = (9 / 5.0) * celcius + 32;
		System.out.println(celcius + "C is " + fahrenheit + "F.");
		
		
		
		
	}

}
