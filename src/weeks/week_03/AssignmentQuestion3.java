package weeks.week_03;

import java.util.Scanner;

public class AssignmentQuestion3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a four digit integer: ");
		int x = in.nextInt();
		
		int digitTausents = x / 1000;
		int digitHunderts = (x / 100) % 10;
		int digitTens = ( x % 100) / 10;
		int digitOnes = (x % 100) % 10;
		
		System.out.println(digitOnes +""+ digitTens +""+ digitHunderts +""+ digitTausents);
	}

}
