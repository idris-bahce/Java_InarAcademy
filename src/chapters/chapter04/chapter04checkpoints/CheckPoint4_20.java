package chapters.chapter04.chapter04checkpoints;

public class CheckPoint4_20 {
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "welcome";
		
		boolean isEqual= s1.equals(s2);
		System.out.println(isEqual);
		
		boolean isEqualb = s1.equalsIgnoreCase(s2);
		System.out.println(isEqualb);
		
		int x = s1.compareTo(s2);
		System.out.println(x);
		
		int xd = s1.compareToIgnoreCase(s2);
		System.out.println(xd);
		
		boolean b1 = s1.startsWith("AAA");
		System.out.println(b1);
		
		boolean b2 = s1.endsWith("AAA");
		System.out.println(b2);
		
		int xg = s1.length();
		System.out.println(xg);
		
		char xh = s1.charAt(0);
		System.out.println(xh);
		
		System.out.println(s1 + s2);
		
		String s3 = s1.substring(1);
		System.out.println(s3);
		
		String s4 = s1.substring(1, 4);
		System.out.println(s4);
		
		String s5 = s1.toLowerCase();
		System.out.println(s5);
		
		String s6 = s2.toUpperCase();
		System.out.println(s6);
		
		String s7 = s1.trim();
		System.out.println(s7);
		
		int o = s1.indexOf('e');
		System.out.println(o);
		
		int p = s1.lastIndexOf("abc");
		System.out.println(p);
	}

}
