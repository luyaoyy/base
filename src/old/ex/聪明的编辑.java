import java.util.Scanner;

public class ´ÏÃ÷µÄ±à¼­ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- != 0) {
			StringBuffer s = new StringBuffer(sc.next());
			for (int i = 0; i < s.length(); i++) {
				if (i + 2 <= s.length() - 1 && s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
					s.deleteCharAt(i+2);
					i--;
				}
				if(i+3<=s.length()-1&&s.charAt(i)==s.charAt(i+1)&&s.charAt(i+2)==s.charAt(i+3)) {
					s.deleteCharAt(i+3);
					i--;
				}
			}
			System.out.println(s);
		}
	}
}
