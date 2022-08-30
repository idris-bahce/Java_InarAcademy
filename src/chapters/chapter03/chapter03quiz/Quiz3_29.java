package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();

		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		double distanceCenter = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

		if ((r1 - r2) < 0) {
			double temp = r1;
			r1 = r2;
			r2 = temp;

		}

		if ((r1 - r2) >= distanceCenter) {
			System.out.println("circle2 is inside circle1 ");
		} else if (r1 + r2 >= distanceCenter) {
			System.out.println("circle2 overlaps circle1 ");
		} else {
			System.out.println("circle2 does not overlap circle1 ");
		}

	}

}
