package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_44 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        System.out.print("Enter a short integer: ");
	        short number = in.nextShort();

	        String bits = "";

	        for (int i = 0; i < 16; i++) {
	            bits = (number & 1) + bits;
	            number >>= 1;
	        }
	        in.close();
	        System.out.println("The bits are " + bits);

	}
}
