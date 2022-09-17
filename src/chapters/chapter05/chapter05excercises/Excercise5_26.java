package chapters.chapter05.chapter05excercises;

public class Excercise5_26 {
	public static void main(String[] args) {
		a();
		b();
	}
	public static void a() {
		double e = 0;
		double sum = 0;
		int iteration = 10000;
		int factor = 10000;
		while (iteration > 0) {
			double num = 0;
			for (int i = factor; i > 0; i--) {
				num += i;
			}
			sum += 1 / num;
			iteration--;
			factor--;
		}
		e = 1 + sum;
		System.out.println(e);
		System.out.println(Math.E);
	}
	public static void b() {
		double e = 0;
		double sum = 0;
		int iteration = 20000;
		int factor = 20000;
		while (iteration > 0) {
			double num = 0;
			for (int i = factor; i > 1; i--) {
				num *= i;
			}
			sum += 1 / num;
			iteration--;
			factor--;
		}
		e = 1 + sum;
		System.out.println(e);
		System.out.println(Math.E);
	}
}
