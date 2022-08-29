package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of month: ");
		int month = in.nextInt();
		System.out.println("Enter the year:");
		int year = in.nextInt();
		

		switch (month) {
		case 1:
			System.out.println("There are 31 days in january in year " + year);
			break;
		case 2:
			if(year % 4 !=0) {
			System.out.println("There are 28 days in february in year " + year);
			}else
				System.out.println("There are 29 days in february in year " + year);
			break;
		case 3:
			System.out.println("There are 31 days in march in year " + year);
			break;
		case 4:
			System.out.println("There are 30 days in april in year " + year);
			break;
		case 5:
			System.out.println("There are 31 days in may in year " + year);
			break;
		case 6:
			System.out.println("There are 30 days in june in year " + year);
			break;
		case 7:
			System.out.println("There are 31 days in july in year " + year);
			break;
		case 8:
			System.out.println("There are 31 days in agust in year " + year);
			break;
		case 9:
			System.out.println("There are 30 days in september in year " + year);
			break;
		case 10:
			System.out.println("There are 31 days in october in year " + year);
			break;
		case 11:
			System.out.println("There are 30 days in november in year " + year);
			break;
		case 12:
			System.out.println("There are 31 days in december in year " + year);
			break;
		
		}

	}

}
