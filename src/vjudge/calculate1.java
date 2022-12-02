package vjudge;

import java.util.*;

public class calculate1 {
	public static int cal(String str) {
		String[] arr = str.split("((?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)|(?=\\*)|(?<=\\*)|(?=\\/)|(?<=\\/))");
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++)
			list.add(arr[i]);
		for (int i = 0; i < list.size(); i++) {
			String str1 = null;
			if (list.get(i).equals("*") || list.get(i).equals("/")) {
				if (list.get(i).equals("*"))
					str1 = String.valueOf(Double.parseDouble(list.get(i - 1)) * Double.parseDouble(list.get(i + 1)));
				if (list.get(i).equals("/"))
					str1 = String.valueOf(Double.parseDouble(list.get(i - 1)) / Double.parseDouble(list.get(i + 1)));
				list.remove(i - 1);
				list.remove(i - 1);
				list.remove(i - 1);
				list.add(i - 1, str1);
				i--;
			} else
				continue;
		}
		while (list.size() != 1) {
			String str11 = null;
			if (list.get(1).equals("+"))
				str11 = String.valueOf(Double.parseDouble(list.get(0)) + Double.parseDouble(list.get(2)));
			if (list.get(1).equals("-"))
				str11 = String.valueOf(Double.parseDouble(list.get(0)) - Double.parseDouble(list.get(2)));
			list.remove(0);
			list.remove(0);
			list.remove(0);
			list.add(0, str11);
		}
		return Integer.parseInt(list.get(0));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String str = s.nextLine();
			if (str.equals("0"))
				break;
			System.out.println(cal(str));
		}
	}
}