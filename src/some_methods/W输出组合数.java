package w一些方法;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class W输出组合数 {
	static Set<String> set = new HashSet<String>();
	public static int r = 0, n = 0;
	public static boolean[] bool;
	public static int[] num1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		sc.close();
		int[] num = new int[r + 1];
		num1 = new int[r + 1];
		bool = new boolean[n + 1];
		String s = "";
		f(1, num);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void f(int a, int[] num) {
		if (a == r + 1) {
			num1 = num.clone();
			Arrays.sort(num1);
			String s = "";
			for (int i = 1; i < num1.length; i++) {
				s = s + num1[i];
			}
			set.add(s);
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!bool[i]) {
				bool[i] = true;
				num[a] = i;
				f(a + 1, num);
				num[a] = 0;
				bool[i] = false;
			}
		}
	}
}