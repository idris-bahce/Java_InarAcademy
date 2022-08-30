package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double w1 = in.nextDouble();
		double h1 = in.nextDouble();

		double rectangleRight = x1 + w1 / 2;
		double rectangleLeft = x1 - w1 / 2;
		double rectangleTop = y1 + h1 / 2;
		double rectangleBottom = y1 - h1 / 2;

		System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double w2 = in.nextDouble();
		double h2 = in.nextDouble();

		double rectangleRight2 = x2 + w2 / 2 ;
		double rectangleLeft2 = x2 - w2 / 2 ;
		double rectangleTop2 = y2 + h2 / 2 ;
		double rectangleBottom2 = y2 - h2 / 2 ;
		
		boolean isInside = rectangleRight >= rectangleRight2 && rectangleLeft <= rectangleLeft2 && 
				rectangleTop >= rectangleTop2 && rectangleBottom <= rectangleBottom2 ;
		
		boolean isOutside = rectangleRight < rectangleLeft2 || rectangleLeft > rectangleRight2 || 
				rectangleTop < rectangleBottom2 || rectangleBottom > rectangleTop2 ;
		
				
		if(isInside)
			System.out.println("r2 is inside r1");
		else if(isOutside)
			System.out.println("r2 does not overlap r1");
		else 
			System.out.println("r2 overlaps r1");
	}

}
