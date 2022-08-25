package chapters.chapter03.chapter03listings;

import java.util.Scanner;

public class SubstructionQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = (int)(Math.random() * 10);
		int y = (int)(Math.random() * 10);
	
		if(y>x) {
			int temp = x;
			x = y ;
			y = temp;
		}
		System.out.println(x + "-" + y);
		System.out.println("what is the answer of this equevalent: ");
		int correct = input.nextInt();
		
		
		if (x - y == correct) {
			System.out.println("Correct!");
		}else {
			System.out.println("wrong!");
		}
	}

}
