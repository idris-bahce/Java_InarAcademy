package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		
		double x = (e*d - b*f) / (a*d - b*c);
		double y = (a*f - e*c) / (a*d - b*c);
		
		if (a*d - b*c == 0) {
			System.out.println("The equation has no solution.");
		}else {
			System.out.println("x is " + x + " y is " + y);
		}
	}

}
