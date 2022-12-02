package 动态规划;

import java.util.Scanner;

public class W完全背包问题 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] W = new int[n + 1];
		int[] V = new int[m + 1];
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			String s = sc.nextLine();
			W[i] = Integer.valueOf(s.split(" ")[0]);
			V[i] = Integer.valueOf(s.split(" ")[1]);
		}
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (j < W[i]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j - W[i]] + V[i]);
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}
