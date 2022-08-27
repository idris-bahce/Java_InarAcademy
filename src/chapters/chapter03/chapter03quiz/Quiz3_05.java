package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter today's day:(please enter integers 0-6)");
		int todaysDay =in.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDay =in.nextInt();
		
		int x = elapsedDay % 7;
		
		
		if(todaysDay == 0) {
			System.out.println("sunday");
		}else if(todaysDay == 1) {
			System.out.println("monday");
		}else if(todaysDay == 2) {
			System.out.println("tuesday");
		}else if(todaysDay == 3) {
			System.out.println("wednesday");
		}else if(todaysDay == 4) {
			System.out.println("thursday");
		}else if(todaysDay == 5) {
			System.out.println("friday");
		}else{
			System.out.println("saturday");
		}
		
		
		
		if(x == 0) {
			System.out.println("sunday");
		}else if(x == 1) {
			System.out.println("monday");
		}else if(x == 2) {
			System.out.println("tuesday");
		}else if(x == 3) {
			System.out.println("wednesday");
		}else if(x == 4) {
			System.out.println("thursday");
		}else if(x == 5) {
			System.out.println("friday");
		}else{
			System.out.println("saturday");
		}
		
		
	
	}

}
