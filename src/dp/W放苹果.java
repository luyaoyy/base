package 动态规划;

import java.util.Scanner;

public class W放苹果 {
	public static int dp(int m, int n) {
		// 定义一个数组存放中间计算值
		int[][] resultTable = new int[m + 1][n + 1];
		for (int j = 1; j <= n; j++) {
			// 没有苹果
			resultTable[0][j] = 1;
		}
		for (int i = 1; i <= m; i++) {
			// 只有一个篮子
			resultTable[i][1] = 1;
		}
		// i代表苹果，j代表篮子
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > i) {
					resultTable[i][j] = resultTable[i][i];
				} else {
					resultTable[i][j] = resultTable[i][j - 1] + resultTable[i - j][j];// 和整数划分类似
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