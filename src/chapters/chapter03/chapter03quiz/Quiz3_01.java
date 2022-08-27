package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double r1 = (-b + Math.pow(b*b - (4*a*c), 0.5)) / (2 * a);
		double r2 = (-b - Math.pow(b*b - (4*a*c), 0.5)) / (2 * a);
		
		if(b*b - 4*a*c > 0) {
			
			System.out.println("The equation has two roots: " + r1 + " and " + r2);
		}else if(b*b - 4*a*c == 0) {
			System.out.println("Equation has one root: " + r1);
		}else {
			System.out.println("equation has no root.");
		}
	}

}
