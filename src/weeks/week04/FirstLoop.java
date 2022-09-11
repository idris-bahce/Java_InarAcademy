package weeks.week04;

public class FirstLoop {
	public static void main(String[] args) {
		String str = "Bukovsky";
		int length = str.length();
		String str1 = "";
		
		for (int i = 0; i < length; i++) {
			char letter = str.toLowerCase().charAt(i);
			if(letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u') {
			}else {
				System.out.print(str1+letter);
			}
		}
	}

}
