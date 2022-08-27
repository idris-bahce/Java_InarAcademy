package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three points for a triangle: ");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		double side4 = in.nextDouble();
		double side5 = in.nextDouble();
		double side6 = in.nextDouble();
		
		double s1 = Math.abs(side2 - side1) ;
		double s2 = Math.abs(side4 - side3);
		double s3 = Math.abs(side6 - side5);
		
		double S = (s1 + s2 + s3) / 2;
		area = Math.pow(S, S)
	}

}
