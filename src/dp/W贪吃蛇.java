package 动态规划;

import java.util.Scanner;

public class W贪吃蛇 {
	public static void main(String[] args) {//本题也可直接用dp当地图
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), sum = sc.nextInt();
		sc.nextLine();
		int[][] dp = new int[m][n];
		for (int i = 0; i < sum; i++) {
			String s = sc.nextLine();
			dp[Integer.valueOf(s.split(" ")[0])][Integer.valueOf(s.split(" ")[1])] = 1;
		}
		for (int i = 1; i < n; i++) {
			dp[0][i] = dp[0][i - 1] + dp[i][0];
		}
		for (int i = 1; i < m; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i][0];
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j])+dp[i][j];
			}
		}
		System.out.println(dp[m-1][n-1]);
	}
}
