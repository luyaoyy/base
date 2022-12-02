package w一些方法;

import java.util.Scanner;

public class 最长对称子序列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		boolean[][] dp = new boolean[l][l];
		for (int i = 0; i < l; i++) {
			dp[i][i] = true;
			for (int j = 0; j < i; j++) {
				if (i - j == 1 && s.charAt(i) == s.charAt(j))
					dp[i][j] = true;
				else if (s.charAt(i) == s.charAt(j) && dp[i - 1][j + 1])
					dp[i][j] = true;
			}
		}
		int max = 0;
		String str = s.substring(0, 1);
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < i; j++) {
				if (dp[i][j]) {
					if (i - j + 1 > max) {
						max = i - j + 1;
						str = s.substring(j, i + 1);
					}
				}
			}
		}
		System.out.println(str);
	}
}
