package vjudge4;

import java.util.ArrayList;
import java.util.Scanner;

public class w09 {
	public static boolean judge(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
			return false;
		else
			return true;
	}

	public static String cal(String s1, String s2, String s3) {
		switch (s3) {
		case "+":
			return String.valueOf(Double.valueOf(s1) + Double.valueOf(s2));
		case "-":
			return String.valueOf(Double.valueOf(s1) - Double.valueOf(s2));
		case "*":
			return String.valueOf(Double.valueOf(s1) * Double.valueOf(s2));
		case "/":
			return String.valueOf(Double.valueOf(s1) / Double.valueOf(s2));
		}
		return "0";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
			list.add(arr[i]);
		for (int i = 0; i < list.size() - 1; i++) {
			if (judge(list.get(i)) && judge(list.get(i + 1))) {
				String ss = cal(list.get(i), list.get(i + 1), list.get(i - 1));
				list.remove(i - 1);
				list.remove(i - 1);
				list.remove(i - 1);
				list.add(i - 1, ss);
				i=0;
			}
		}
			System.out.println(String.format("%.6f", Double.valueOf(list.get(0))));
	}
}
