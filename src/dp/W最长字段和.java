package 动态规划;

import java.util.Scanner;

public class W最长字段和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int[] dp = new int[n];
		dp[0] = a[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1], 0) + a[i];
		}
		int max = dp[0];
		for (int i : dp)
			max = Math.max(i, max);
		System.out.println(max);
	}
}
