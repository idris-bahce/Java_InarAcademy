package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_27 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coordinates: ");
		double x =in.nextDouble();
		double y =in.nextDouble();
		
		if(x == 0 && y <= 100) {
			System.out.println("The point is in triangle.");
		}else if (y == 0 && x <= 200) {
			System.out.println("The point is in triangle.");
		}else if (y / x <= 0.5) {
			System.out.println("The point is in triangle.");
		}else
			System.out.println("The point is not in triangle.");
	}

}
