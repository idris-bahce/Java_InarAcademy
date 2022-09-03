package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex: ");
		double x = in.nextDouble();
		
		double s = 2 * x * Math.sin(Math.PI / 5);
		double area = (s*s*5)/(4 * Math.tan(Math.PI/5));
		
		System.out.println("The area of the pentagon is: " + area);
	}
}
