package ��̬�滮;

import java.util.Scanner;

public class W����������ȫ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] num = new int[n + 1];
			for (int i = 1; i <= n; i++)
				num[i] = i;
			int[][] dp = new int[n + 1][n + 1];
			dp[0][0] = 1;//����Ҫ��������ʼ��  ��ϰ���0 n
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					if (j >= num[i]) {
						dp[i][j] = dp[i - 1][j] + dp[i][j - num[i]];
					} else {
						dp[i][j] = dp[i - 1][j];
					}
				}
			}
			System.out.println(dp[n][n]);
		}
	}
}
