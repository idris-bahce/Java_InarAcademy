package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		if(Math.pow(x * x + y * y, 0.5)<=10) {
			System.out.println("(" + x + ", " + y + ") is in the border of the circle.");
		}else {
			System.out.println("(" + x + ", " + y + ") is not in the border of the circle.");
		}
	}

}
