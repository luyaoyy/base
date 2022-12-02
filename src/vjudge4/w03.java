package vjudge4;

import java.util.ArrayList;
import java.util.Scanner;

public class w03 {
	static ArrayList<String> list = new ArrayList<>();
	static int[] arr = new int[8];//arr[i]表示棋子横坐标i，纵坐标为arr[i]
	public static boolean judge(int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == arr[n] || n - i == Math.abs(arr[n] - arr[i])) {
				return false;
			}
		}
		return true;
	}

	public static void add() {
		String str = "";
		for (int i = 0; i < 8; i++) {
			str += (arr[i] + 1) + "";
		}
		list.add(str);
	}

	public static void fun(int n) {
		if (n == 8) {
			add();
			return;
		}
		for (int i = 0; i < 8; i++) {
			arr[n] = i;
			if (judge(n)) {
				fun(n + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fun(0);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			System.out.println(list.get(m-1));
		}
	}
}
