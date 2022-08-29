package chapters.chapter01;

public class Excercise1_12 {
	public static void main(String[] args) {
		double seconds = 6035;
		double km = 24 * 1.6;
		
		double hour = seconds / 3600;
		
		double averageSpeedInKm= km / hour;
		
		System.out.println("Runner runs averagely " + averageSpeedInKm + "km/hour.");
	}

}
