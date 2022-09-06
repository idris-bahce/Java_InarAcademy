package chapters.chapter04.chapter04excercises;

import java.util.Scanner;

public class Excercise4_23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = in.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		double hours = in.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double payRate = in.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fedTax= in.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTax=in.nextDouble();
		
		double grosPay = payRate * hours;
		double deduction1 = grosPay * fedTax;
		double deduction2 = grosPay * stateTax;
		double total = grosPay-(deduction1+deduction2);
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+hours);
		System.out.println("Pay Rate: $"+payRate);
		System.out.println("Gross Pay: $"+grosPay);
		System.out.println("Deductions: \n"
				+ "   Federal Withholding ("+fedTax*100.0+"%): $"+deduction1+ " \n"
						+ "   State Withholding ("+stateTax*100.0+"%): $"+deduction2+" \n"
								+ "   Total Deduction: $"+(deduction1+deduction2)+"\n"
										+ "Net Pay: $"+total);
	}

}
