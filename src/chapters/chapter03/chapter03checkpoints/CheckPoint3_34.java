package chapters.chapter03.chapter03checkpoints;

import java.util.Scanner;

public class CheckPoint3_34 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int priceLow = 10;
		int price = 20;
		System.out.println("Enter your age: ");
		int ages = input.nextInt();
		
		System.out.println((ages<=16) ?  priceLow : price);
	}

}
