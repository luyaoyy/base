package vjudge7;

import java.util.Scanner;

public class w08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[][] dp = new int[n + 1][n + 1];
			for (int i = 1; i <= n; i++) {
				dp[1][i] = 1;
				dp[i][1] = 1;
			}
			for (int i = 2; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == j)
						dp[i][j] = 1 + dp[i][j - 1];
					else if (i > j) {
						dp[i][j] = dp[i - j][j] + dp[i-1][j - 1];
					} else
						dp[i][j] = dp[i][i];
				}
			}
			System.out.println(dp[n][n]);
		}

	}
}
