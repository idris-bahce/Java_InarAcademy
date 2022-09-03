package chapters.chapter04.chapter04excercises;

public class Excercise4_06 {
	public static void main(String[] args) {

		double radius = 40;

		double angle1 = Math.random() * 360;
		angle1 = angle1 * Math.PI / 180;
		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);

		double angle2 = Math.random() * 360;
		angle2 = angle2 * Math.PI / 180;
		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);

		double angle3 = Math.random() * 360;
		angle3 = angle3 * Math.PI / 180;
		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);

		System.out.printf("The first point is %2.2f %2.2f\n", x1, y1);
		System.out.printf("The second point is %2.2f %2.2f\n", x2, y2);
		System.out.printf("The third point is %2.2f %2.2f", x3, y3);
	}
}
