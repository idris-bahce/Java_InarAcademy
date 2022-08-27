package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a integer number: (e.g:1156)");
		int amount = input.nextInt();
		int dolars = amount / 100;
		int cents = amount % 100;
		System.out.println("The input " + amount + " represents " + dolars + " dolars" + " and " + cents +" cents." );

	
	}

}
