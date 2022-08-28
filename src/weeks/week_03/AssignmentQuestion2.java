package weeks.week_03;

import java.util.Scanner;

public class AssignmentQuestion2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age of three people: ");
		
		int age1 = in.nextInt();
		int age2 = in.nextInt();
		int age3 = in.nextInt();
		
		if(age1>age2 && age1>age3) {
			System.out.println("The oldest age is " + age1);
			if(age2 > age3) {
				System.out.println("The youngest age is " + age3);
			}else {
				System.out.println("The youngest age is " + age2);
			}
			
		}if(age2>age3 && age2>age1) {
			System.out.println("The oldest age is " + age2);
			if(age3>age1) {
				System.out.println("The youngest age is " + age1);
			}else {
				System.out.println("The youngest age is " + age3);
			}
		}if(age3 > age1 && age3 > age2) {
			System.out.println("The oldest age is " + age3);
			if(age2>age1) {
				System.out.println("The youngest age is " + age1);
			}else {
				System.out.println("The youngest age is " + age2);
			}
		
		
		}
		
		
	
	
	}

}
