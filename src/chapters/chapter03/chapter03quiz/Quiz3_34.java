package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_34 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2:");
		double x0 = in.nextDouble();
		double y0 = in.nextDouble();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
		double p2 = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
		
		if (p2 == 0) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 +")");
		}else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 +")");
		}	
	}



}
