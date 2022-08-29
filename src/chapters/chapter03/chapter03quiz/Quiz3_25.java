package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double x4 = in.nextDouble();
		double y4 = in.nextDouble();
		
		double mD1 = (y2-y1) / (x2-x1);
		double mD2 = (y4 - y3) / (x4 - x3);
		
		if(mD1 == mD2) {
			System.out.println("Two lines are parallel.");
		}else {
			double intSectionx = ((mD1 * x1) - (mD2 * x3) + y3 -y1) / (mD1 - mD2);
			double intSectiony = (mD1 * (intSectionx - x1) + y1 + mD2 * (intSectionx - x3) + y3) / 2;
			System.out.println("Intersection point :" + intSectionx + " " + intSectiony);
		}
	}

}
