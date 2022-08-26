package chapters.chapter03.chapter03listings;

import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		
		switch (year % 12) {
		case 0 : System.out.println("monkey"); break;
		case 1 :System.out.println("rooster"); break;
		case 2 :System.out.println("2: dog"); break;
		case 3 :System.out.println("3: pig"); break;
		case 4 :System.out.println("4: rat"); break;
		case 5 :System.out.println("5: ox"); break;
		case 6 :System.out.println("6: tiger"); break;
		case 7 :System.out.println("7: rabbit"); break;
		case 8 :System.out.println("8: dragon"); break;
		case 9 :System.out.println("9: snake"); break;
		case 10 :System.out.println("10: horse"); break;
		case 11 :System.out.println("11: sheep");
		}
	}

}
