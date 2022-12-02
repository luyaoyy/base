package 动态规划;

import java.util.Scanner;

public class W最长回文子串 {
	public static String palindrome1(String s) {
		String result = "";
		char[] chars = s.toCharArray();
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			dp[i][i] = true;
			for (int j = 0; j < i; j++) {
				if (i - j == 1 && chars[i] == chars[j])
					dp[j][i] = true;
				else if (chars[i] == chars[j] && dp[j + 1][i - 1])
					dp[j][i] = true;
			}
		}
		int max_len = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (dp[j][i]) {
					if (max_len < i - j + 1) {
						max_len = i - j + 1;
						result = s.substring(j, i + 1);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(palindrome1(s));
	}
}
