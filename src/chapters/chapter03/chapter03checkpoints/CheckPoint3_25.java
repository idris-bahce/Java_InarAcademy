package chapters.chapter03.chapter03checkpoints;

import java.util.Scanner;

public class CheckPoint3_25 {
	public static void main(String[] args) {
		boolean yes = true;
		Scanner input= new Scanner(System.in);
		System.out.println("Guess his age!");
		int x = input.nextInt();
		
		if(13<x && x<18) {
			System.out.println(yes);
		}else {
			System.out.println(!yes);
		}
	}

}
