package chapters.chapter04.chapter04excercises;

public class Excercise4_25 {
	public static void main(String[]args) {
		int n1 = (int)(Math.random()*(91-65))+65;
		int n2 = (int)(Math.random()*(91-65))+65;
		int n3 = (int)(Math.random()*(91-65))+65;
		int n4 = (int)(Math.random()*10);
		int n5 = (int)(Math.random()*10);
		int n6 = (int)(Math.random()*10);
		int n7 = (int)(Math.random()*10);
		
		System.out.println("plate number is: "+(char)(n1)+""+(char)(n2)+""+(char)(n3)+""+n4+""+n5+""+n6+""+n7);
		
		
	}

}
