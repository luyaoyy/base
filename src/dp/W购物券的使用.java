package 动态规划;

import java.util.Scanner;

public class W购物券的使用 {
	static int n;
	static int cas = 0;
	static int[][] ans;
	static int money = 0;
	static int[] num;
	static int[] price;

	static void dfs(int x) {
		if (money > 1000 || x >= n) {
			return;
		}
		if (money == 1000) {
			for (int i = 0; i < n; i++) {
				ans[cas][i] = num[i];
			}
			cas++;
			return;
		}
		num[x]++;
		money += price[x];
		dfs(x);
		num[x]--;
		money -= price[x];
		dfs(x + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		price = new int[n];
		num = new int[n];
		ans = new int[100][100];
		for (int i = 0; i < n; i++)
			price[i] = sc.nextInt();
		dfs(0);
		System.out.println(cas);
		for (int i = 0; i < cas; i++) {
			String s = "";
			for (int j = 0; j < n; j++) {
				s += ans[i][j] + " ";
			}
			System.out.println(s.trim());
		}
	}
}
