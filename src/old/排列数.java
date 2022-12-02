import java.util.Scanner;

public class 排列数 {
	static int mod = 123456;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[][] dp = new int[1000][1000];        // dp[i][j]表示放前i个数有j个折点的方案数
		dp[1][0] = 1;
		for (int i = 2; i <= n; i++) {         // 每放一个数折点只能增加0个或者1个或者2个 (规律。。。)
			dp[i][0] = 2;//无折点只有顺序或者倒序 即2种方案
			for (int j = 0; j <= i - 2; j++) {
				dp[i + 1][j] = (dp[i + 1][j] + dp[i][j] * (j + 1)) % mod;          // 折点不增加
				dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j] * 2) % mod;         // 折点增加一个
				dp[i + 1][j + 2] = (dp[i + 1][j + 2] + dp[i][j] * (i - j - 2)) % mod;// 折点增加两个
			}
		}
		System.out.println(dp[n][k - 1]);
	}
}
