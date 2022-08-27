package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_02 {
	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter lenght of cylinder: ");
		double h = input.nextDouble();
		
		double area;
		area = radius * radius * PI;
		double volume = area * h;
		
		System.out.println("The area is: " + (int)(area * 100) / 100.0);
		System.out.println("The volume is " + (int)(volume * 100) / 100.0);
	}

}
