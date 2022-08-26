package chapters.chapter03.chapter03checkpoints;

import java.util.Scanner;

public class CheckPoint3_26 {
	public static void main(String[] args) {
		boolean yes = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the height in inch!");
		int h = input.nextInt();
		
		System.out.println("Guess the weight in pound!");
		int w = input.nextInt();
		
		if(w>50 || h>60) {
			System.out.println(yes);
		}else {
			System.out.println(!yes);
		}
	}

}
