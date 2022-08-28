package weeks.week_03;

import java.util.Scanner;

public class Assignmentquestion1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much is your salary: ");
		double salary = in.nextDouble();
		
		System.out.println("For how many years you are working with us: ");
		double serviceYears = in.nextDouble();
		
		if(serviceYears > 5) {
			double x = salary * 0.05;
			System.out.println("You have net " + x +"bonus.");
		}else
			System.out.println("You don't have exstra bonus.");
	}

}
