package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter avalue for feet: ");
		double feet = input.nextDouble();
		
		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + "meters.");
	}

}
