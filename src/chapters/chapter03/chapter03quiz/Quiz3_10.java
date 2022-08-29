package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_10 {
	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 90) + 10;
		int number2 = (int)(System.currentTimeMillis() / 7 % 90) + 10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + " ?");
		int answer = input.nextInt();
		
		System.out.println(number1 + " +" + number2 + " = " + answer + " is " + (number1+number2==answer));
		
	}



}
