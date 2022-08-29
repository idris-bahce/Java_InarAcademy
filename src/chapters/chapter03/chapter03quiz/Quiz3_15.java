package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_15 {
	public static void main(String[] args) {
		int lotary = (int)(Math.random() * 900) + 100;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digid number: ");
		
		int guess = input.nextInt();
		
		System.out.println(lotary);
		int lotaryDigid100 = lotary / 100;
		int lotaryDigid10 = (lotary / 10) % 10;
		int lotaryDigit1 = (lotary % 100) % 10;
		
		int guessDigid100 = guess / 100;
		int guessDigid10 = (guess / 10) % 10;
		int guessDigit1 = (guess % 100) %10;
		
		if(guess==lotary) {
			System.out.println("Congralations. You win $10000!");
		}else if((lotaryDigid100 == guessDigid100 || lotaryDigid100 == guessDigid10 || lotaryDigid100 == guessDigit1) && 
				(lotaryDigid10 == guessDigit1 || lotaryDigid10 == guessDigid10 || lotaryDigid10 ==guessDigid100) 
				&& (lotaryDigid100 == guessDigit1 || lotaryDigid100 == guessDigid10 || 
				lotaryDigid100==guessDigid100)) {
			System.out.println("Congralations. You win $3000!");
		}else if((lotaryDigit1 == guessDigit1 || lotaryDigit1 == guessDigid10 || lotaryDigit1 == guessDigid100)
				||(lotaryDigid10==guessDigit1||lotaryDigid10==guessDigid10||lotaryDigid10==guessDigid100)||
				(lotaryDigid100==guessDigit1||lotaryDigid100==guessDigid10||lotaryDigid100==guessDigid100)) {
			System.out.println("Congralations. you win $1000!");
		}else
			System.out.println("Sorry. try again...");
		
	}



}
