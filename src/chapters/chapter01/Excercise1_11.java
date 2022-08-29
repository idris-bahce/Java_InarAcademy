package chapters.chapter01;

public class Excercise1_11 {
	public static void main(String[] args) {
		int birthPerYear = 31536000 / 7;
		int deathPerYear = 31536000 / 13;
		int commingImmigrants = 31536000 / 45;
		
		int populationNow = 312032486;
		
		int populationAfterFiveYears = populationNow + birthPerYear*5 - deathPerYear*5 + commingImmigrants*5;
		System.out.println("Population after 5 years is: " + populationAfterFiveYears);

	}
}
