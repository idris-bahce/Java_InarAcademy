package chapters.chapter03.chapter03checkpoints;

public class CheckPoint3_03 {
	public static void main(String[] args) {
		boolean b = true;
		int i = 1;
		i = (int)b;
		
		boolean b = (boolean)i;
		System.out.println(b);
		System.out.println(i);
		
		//so as we can see boolean can not be cast to any orher types.
	}

}
