package chapters.chapter03.chapter03quiz;

import java.util.Scanner;

public class Quiz3_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three integers: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		
		if (x > y && x > z) {
			if(y>z) {
				System.out.println(x + " " + y + " " + z);
			}else {
				System.out.println(x + " " + z + " " + y);
			}
		}if(y>z && y>x) {
			if(x>z) {
				System.out.println(y + " " + x + " " +z);
			}else {
				System.out.println(y + " " + z + " " + x);
			}
		}if (z>x && z>y) {
			if(x>y) {
				System.out.println(z + " " + x + " " + y);
			}else {
				System.out.println(z + " " + y + " " + x);
			}
		}
	}

}
