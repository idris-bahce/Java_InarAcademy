package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter scissor (0), rock (1), paper (2): ");
		int x = in.nextInt();
		
		int y =(int)(Math.random() * 3);

		if((y==0 && x==0)) {
			System.out.println("The computer is scissor. you are scissor.no one wins.");
		}else if (y==1 && x == 1){
			System.out.println("The computer is rock. You are rock. No one wins");
		}else if(y==2&&x==2){
			System.out.println("The computer is paper. You are paper. no one wins.");
		}else if(y==0 && x==1) {
			System.out.println("The computer is scissor.You are rock. You win!");
		}else if(y==0 && x==2) {
			System.out.println("The computer is scissor. You are paper. You are defeated!");
		}else if(y==1 && x==0) {
			System.out.println("The computer is rock. You are scissor. You are defeated!");
		}else if(y==1 && x==2) {
			System.out.println("The computer is rock. You are paper. You win!");
		}else if(y==2 && x==0) {
			System.out.println("The computer is paper. You are scissor. You win!");
		}else if(y==2 && x==1) {
			System.out.println("The computer is paper. You are rock. You are defeated!");
		}else
			System.out.println("Computer wins, you input an invalid value so you forfiet this round!");
		
		
	}

}
