package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle: ");
		double radius = in.nextDouble();
		
		double r = radius/(2 * Math.PI);
		double x1;
		double x2;
		double y1;
		double y2;
		double r = Math.pow((x1*x1-x2*x2)+(y1*y1-y2*y2), 0.5);
	}

}
