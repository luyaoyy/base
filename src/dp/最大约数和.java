package ��̬�滮;

import java.util.Scanner;

public class ���Լ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sum = new int[n + 1];
		sum[1] = 0;//01�������� ��ѡȡ�����Ĵ�С�������������Լ���Ϳ��ɼ�ֵ
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum[i] += j;
				}
			}
		}
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j >= i) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - i] + sum[i]);
				} else
					dp[i][j] = dp[i - 1][j];
			}
		}
		System.out.println(dp[n][n]);
	}
}
