package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side = in.nextDouble();
		
		double area = ((3 * Math.pow(3, 0.5)) / 2) * (side * side);
		System.out.println("The area of the hexagon is: " + area);
	}

}
