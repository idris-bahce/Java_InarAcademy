package weeks.week04;

public class StringMethotDeneme {
	public static void main(String[] args) {
		
		stringMetotdeneme();
		substring();
		equalsIgnoreCase();
		contains();
		trim();
		charAt();
		toLowerCase();
		toUpperCase();
		concat();
		interwiewsquestion();
		interwiewsquestion2();
	}

	public static void stringMetotdeneme() {

		String temp = "I love Inar Academy";
		int length = temp.length();
		System.out.println(length);

	}
	public static void substring() {
		
		String temp = "I love Inar Academy";
		System.out.println(temp.substring(0, 6));
	}
	public static void equalsIgnoreCase() {
		String str = "I love Inar Academy";
		String str1 = "i love inar academy";
		System.out.println(str.equalsIgnoreCase(str1));
	}
	public static void contains() {
		String str = "I love Inar Academy";
		String str1 = "love";
		System.out.println(str.contains(str1));
	}
	public static void trim() {
		String str = "    I love Inar Academy  \n   ";
		System.out.println(str.trim());
		
	}
	public static void charAt() {
		String str = "I love Inar Academy";
		System.out.println(str.charAt(5));
	}
	public static void toLowerCase() {
		String str = "I love Inar Academy";
		System.out.println(str.toLowerCase());
	}
	public static void toUpperCase() {
		String str = "I love Inar Academy";
		System.out.println(str.toUpperCase());
	}
	public static void concat() {
		String str = "I love ";
		String str2 = "Inar Academy";
		System.out.println(str.concat(str2));
	}
	public static void interwiewsquestion() {
		int i = -84;
		String str ="";
		System.out.println(str + i);
		
	}
	public static void interwiewsquestion2() {
		
		String str ="Java is fun.";
		int letterLenght = str.length();
		String str1 = "";
		
		for (int i = 0; i < letterLenght; i++) {
			char letter = str.toLowerCase().charAt(i);
			if(letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u') {
				System.out.print(str1 + letter);
			}
		}
		
		
	}
	
}
