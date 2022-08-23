package chapters.chapter02.chapter02checkpoints;

public class CheckPoint2_23 {
	public static void main(String[] args) {

		long totalMillisecons = System.currentTimeMillis();

		long totalSeconds = totalMillisecons / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currenMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24;

		System.out.println("Current time is " + currentHour + ":" + currenMinute + ":" + currentSecond + "GMT");

	}

}
