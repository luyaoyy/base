
public class 质数拆分 {
	static boolean[] vis;
	static int[] prim;
	static long ans;

	public static void main(String[] args) {
		prim = new int[2020];
		vis = new boolean[2020];
		for (int i = 2; i <= 2019; i++) {//先打素数表
			if (!vis[i]) {
				for (int j = 2 * i; j <= 2019; j += i) {
					vis[j] = true;
				}
			}
		}
		int id = 0;// prim[id]表示第id个质数的值，下标从1开始，非0
		for (int i = 2; i <= 2019; i++) {
			if (!vis[i])
				prim[++id] = i;
		}
		long dp[][] = new long[id + 1][2020];// dp[i][j]表示前i个质数组成和为j的不同组合数
		dp[0][0] = 1;//初始化 重要！！
		for (int i = 1; i <= id; i++) {// 类似背包问题 从prim里选取若干质数，使其和为2019，求选取方法总数
			for (int j = 0; j <= 2019; j++) {
				if (j >= prim[i])
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - prim[i]];
				else
					dp[i][j] = dp[i - 1][j];
			}
		}
		System.out.println(dp[id][2019]);
	}
}
