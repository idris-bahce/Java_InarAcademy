package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		double n = in.nextDouble();
		
		System.out.println("Enter the side:");
		double s = in.nextDouble();
		
		double area = (n*s*s)/4*Math.tan(Math.PI/n);
		System.out.println("The area of the polygon is " + area);
		
	}

}
