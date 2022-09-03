package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double x = in.nextDouble();
		
		double area = (6 * x * x)/(4 * Math.tan(Math.PI/6));
		System.out.println("The area of the hexagon is " + area);
	}

}
