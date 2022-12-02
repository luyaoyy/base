import java.util.Scanner;

public class 最优包含 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next();
		int l1 = s1.length(), l2 = s2.length();// 字符修改操作包括 增 删 改 题目只允许修改 s1中字符
		int[][] dp = new int[l1 + 1][l2 + 1]; // dp[i][j]表示s1前i个字符串中包含s2前j个字符串
		for (int i = 0; i <= l2; i++) {
			for (int j = 0; j <= l2; j++)
				dp[i][j] = 999999999;// 先设置成无穷大
		}
		dp[0][0] = 0;
		for (int i = 1; i <= l1; i++) {
			dp[i][0] = 0;//s1本来就包含s2前0个字符  因为此时s2相等于空字符串
			for (int j = 1; j <= l2; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) // 如果s1第i个字符和s2第j个字符相等,不用操作
					dp[i][j] = dp[i - 1][j - 1];
				else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1] + 1);// 不修改或者修改 看前一个状态哪个修改步数小取哪个
				}
			}
		}
		System.out.println(dp[l1][l2]);
	}
}
