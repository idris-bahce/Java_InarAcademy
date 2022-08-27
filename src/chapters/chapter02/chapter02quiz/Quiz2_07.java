package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numberof minutes: ");
		int minutes = input.nextInt();
		
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		
	}

}
