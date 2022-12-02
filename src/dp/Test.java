package ¶¯Ì¬¹æ»®;

import java.math.BigInteger;

public class Test {
	public static String palindrome1(String str) {
		char chs[] = str.toCharArray();
		int max_len = 0;
		boolean f[][] = new boolean[chs.length][chs.length];
		String s=str.substring(0,1);
		for (int j = 0; j < str.length(); j++) {
			
			f[j][j] = true;
			for (int i = 0; i < j; i++) {
				if (j - i == 1 && chs[i] == chs[j]) {
					f[i][j] = true;
				} else if (chs[i] == chs[j] && f[i + 1][j - 1]) {
					f[i][j] = true;
				}
				if (f[i][j]) {
					max_len = Math.max(max_len, j - i + 1);
					s=str.substring(i,j+1);
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(palindrome1("Is PAT&TAP symmetric?"));
	}
}
