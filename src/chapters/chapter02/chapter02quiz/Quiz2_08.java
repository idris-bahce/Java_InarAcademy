package chapters.chapter02.chapter02quiz;

import java.util.Scanner;

public class Quiz2_08 {

	public static void main(String[] args) {
long totalMillisecons = System.currentTimeMillis();
		
		long totalSeconds = totalMillisecons / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currenMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter time zone offset to GMT: ");
		int gmt = input.nextInt();
		currentHour +=gmt;
		
		System.out.println("Current time is " + currentHour + ":" + currenMinute + ":" + currentSecond + " +"+ gmt+ "GMT");
	}

}
