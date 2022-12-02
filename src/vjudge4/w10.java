package vjudge4;

import java.util.Scanner;
import java.util.Stack;

public class w10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Stack<String> sta = new Stack<>();
			String str = sc.next();
			String s = "";
			String[] arr = str.split("");
			for (int i = 0; i < str.length(); i++) {
				if (!(arr[i].equals("(") || arr[i].equals(")")))
					arr[i] = " ";
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("(")) {
					sta.push(arr[i] + " " + i);
				} else if (arr[i].equals(")")) {
					if (!sta.isEmpty()) {
						sta.pop();
					} else {
						arr[i] = "?";
					}
				}
			}
			for (int i = 0; i < sta.size(); i++) {
				int id = Integer.valueOf(sta.get(i).split(" ")[1]);
				arr[id] = "$";
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("(") || arr[i].equals(")"))
					arr[i] = " ";
			}
			System.out.println(str);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}
