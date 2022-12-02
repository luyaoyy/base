package ��̬�滮;

import java.util.Scanner;

public class W��ƻ�� {
	public static int dp(int m, int n) {
		// ����һ���������м����ֵ
		int[][] resultTable = new int[m + 1][n + 1];
		for (int j = 1; j <= n; j++) {
			// û��ƻ��
			resultTable[0][j] = 1;
		}
		for (int i = 1; i <= m; i++) {
			// ֻ��һ������
			resultTable[i][1] = 1;
		}
		// i����ƻ����j��������
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > i) {
					resultTable[i][j] = resultTable[i][i];
				} else {
					resultTable[i][j] = resultTable[i][j - 1] + resultTable[i - j][j];// ��������������
				}
			}
		}
		return resultTable[m][n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int m = sc.nextInt(), n = sc.nextInt();
			System.out.println(dp(m, n));
		}
	}
}