package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		
		x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 =in.nextDouble();
		double y2 = in.nextDouble();
		
		x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
		
		double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("The distance between the two points is " + d +"km.");
		
	}

}
