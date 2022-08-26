package chapters.chapter03.chapter03listings;

import java.util.Scanner;

public class Lotary {
	public static void main(String[] args) {
		int lotary = (int)(Math.random() * 90) + 10;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two digid number: ");
		
		int guess = input.nextInt();
		System.out.println(lotary);
		
		int lotaryDigid1 = lotary / 10;
		int lotaryDigid2 = lotary % 10;
		int guessDigid1 = guess / 10;
		int guessDigid2 = guess % 10;
		
		if(guess==lotary) {
			System.out.println("Congralations. You win $10000!");
		}else if(lotaryDigid1 == guessDigid1 && lotaryDigid1 == guessDigid2) {
			System.out.println("Congralations. You win $3000!");
		}else if(lotaryDigid1 == guessDigid1 || lotaryDigid1 == guessDigid2 || lotaryDigid2 == guessDigid1 || lotaryDigid2 == guessDigid2) {
			System.out.println("Congralations. you win $1000!");
		}else
			System.out.println("Sorry. try again...");
		
	}

}
