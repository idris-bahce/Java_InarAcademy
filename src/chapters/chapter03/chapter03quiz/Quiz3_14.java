package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_14 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		boolean heads = true;
		boolean tails = false;
		
		int x = (int)(Math.random() * 2);
		System.out.println("Guess if it is tails(1) or heads(2): ");
		int y =in.nextInt();
		
		if(y<1 || y>2) {
			System.out.println("ERROR!");
		}else if(x!=y){
			System.out.println(tails);
		}else if(y==x) {
			System.out.println(heads);
		}
		
	}

}
