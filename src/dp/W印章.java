package ¶¯Ì¬¹æ»®;

import java.util.Scanner;

public class WÓ¡ÕÂ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		double p = 1.0 / n;
		double[][] dp = new double[m+1][n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(i<j)
					dp[i][j]=0;
				if(j==1)
					dp[i][j]=Math.pow(p, i-1);
				else {
					dp[i][j]=dp[i-1][j]*j*p+dp[i-1][j-1]*(n-j+1)*p;
				}
			}
		}
		System.out.println(String.format("%.4f", dp[m][n]));
	}
}
