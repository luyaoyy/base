package vjudge7;

import java.util.Scanner;

public class louti {
	public static boolean fun(int n) {
		if(n==1)
			return true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		dp[1] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (fun(j)) {
					dp[i] += dp[i - j];
				}
			}
		}
		System.out.println(dp[n]);
	}
}
