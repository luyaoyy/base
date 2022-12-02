package vjudge6;

import java.util.ArrayList;
import java.util.Scanner;

public class W08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> dict = new ArrayList<>();
		ArrayList<String> answ = new ArrayList<>();
		while (sc.hasNext())
			dict.add(sc.next());
		for (int i = 0; i < dict.size(); i++) {
			String s = dict.get(i);
			String ans_word;
			for (int j = 0; j < s.length(); j++) {
				boolean flag = false;
				ans_word = s.substring(0, j + 1);
				for (int k = 0; k < dict.size(); k++) {
					if (ans_word.length() > dict.get(k).length())
						continue;
					if (k != i) {
						String s_ = dict.get(k).substring(0, j + 1);
						if (ans_word.equals(s_)) {
							flag = true;
							break;
						}
					}
				}
				if (!flag || j == s.length() - 1) {
					answ.add(ans_word);
					break;
				}
			}
		}
		for (int i = 0; i < dict.size(); i++) {
			System.out.println(dict.get(i) + " " + answ.get(i));
		}
	}
}