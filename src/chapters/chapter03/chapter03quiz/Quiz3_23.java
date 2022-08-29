package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		if((Math.pow(x*x + y*y, 0.5)) <= Math.pow(2.5*2.5 + 5*5, 0.5)) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
		}else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
		}
		
	}

}
