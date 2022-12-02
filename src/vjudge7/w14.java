package vjudge7;

import java.util.Scanner;

public class w14 {
	public static boolean fun(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			String s = sc.next();
			int[] dp = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j <= i; j++) {
					if (fun(s.substring(j, i+1))) {
						dp[i]=Math.min(dp[i], dp[j-1]+1);
					}
				}
			}
			System.out.println(dp[s.length()-1]);
		}
	}
}
