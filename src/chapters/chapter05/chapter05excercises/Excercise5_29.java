package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter year : ");
		int year = input.nextInt();
		System.out.println("Enter number of day : ");
		int day = input.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		for (int month = 1; month <= 12; month++) {
			String monthStr = "";
			String dayStr = "";

			switch (month) {
			case 1:
				monthStr = "January";
				break;

			case 2:
				monthStr = "Fabruary";
				day = (day + 31) % 7;
				break;
			case 3:
				monthStr = "March";
				if (isLeapYear) {
					day = (day + 29) % 7;
				} else
					day = (day + 28) % 7;
				break;
			case 4:
				monthStr = "April";
				day = (day + 31) % 7;
				break;
			case 5:
				monthStr = "May";
				day = (day + 30) % 7;
				break;
			case 6:
				monthStr = "June";
				day = (day + 31) % 7;
				break;
			case 7:
				monthStr = "July";
				day = (day + 30) % 7;
				break;
			case 8:
				monthStr = "August";
				day = (day + 31) % 7;
				break;
			case 9:
				monthStr = "September";
				day = (day + 31) % 7;
				break;
			case 10:
				monthStr = "October";
				day = (day + 30) % 7;
				break;
			case 11:
				monthStr = "November";
				day = (day + 31) % 7;
				break;
			case 12:
				monthStr = "December";
				day = (day + 30) % 7;
				break;
			}
			switch (day) {
			case 0:
				dayStr = "Sunday";
				break;
			case 1:
				dayStr = "Monday";
				break;
			case 2:
				dayStr = "Tuesday";
				break;
			case 3:
				dayStr = "Wednesday";
				break;
			case 4:
				dayStr = "Thursday";
				break;
			case 5:
				dayStr = "Friday";
				break;
			case 6:
				dayStr = "Saturday";
				break;

			}

			System.out.printf("%-10s%-3s%-4d%-4s%-10s\n", monthStr, " 1 ,", year, " is ", dayStr);

		}

	}
}
/*January    1 ,2013 is Tuesday   
Fabruary   1 ,2013 is Friday    
March      1 ,2013 is Friday    
April      1 ,2013 is Monday    
May        1 ,2013 is Wednesday 
June       1 ,2013 is Saturday  
July       1 ,2013 is Monday    
August     1 ,2013 is Thursday  
September  1 ,2013 is Sunday    
October    1 ,2013 is Tuesday   
November   1 ,2013 is Friday    
December   1 ,2013 is Sunday */
