package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();

		double angle = Math.toRadians(360 / 5.0);
		double angle1 = angle;
		double angle2 = angle * 2;
		double angle3 = angle * 3;
		double angle4 = angle * 4;
		double angle5 = angle * 5;

		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);
		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);
		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);
		double x4 = radius * Math.cos(angle4);
		double y4 = radius * Math.sin(angle4);
		double x5 = radius * Math.cos(angle5);
		double y5 = radius * Math.sin(angle5);

		System.out.println("The coordinates of five points on the pentagon are \n " + x1 + ", " + y1 + "\n" + x2 + ", "
				+ y2 + "\n" + x3 + ", " + y3 + "\n" + x4 + ", " + y4 + "\n" + x5 + ", " + y5);

	}

}
