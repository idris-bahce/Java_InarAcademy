package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excerxise4_22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string s1:");
		System.out.println("Enter string s2:");
		String str = in.nextLine();
		String strSub = in.nextLine();
		
			
		if(str.contains(strSub)) {
			System.out.println(strSub + " is substring of " + str );
		}else {
			System.out.println(strSub + " is not substring of " + str);
		}
	}

}
