package vjudge7;

import java.util.Scanner;

public class W15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] dp=new int[n][];
		for(int i=0;i<n;i++) {
			dp[i]=new int[i+1];
			for(int j=0;j<=i;j++) {
				dp[i][j]=sc.nextInt();
			}
		}
		for(int i=1;i<n;i++) {
			dp[i][0]=dp[i-1][0]+dp[i][0];
			dp[i][dp[i].length-1]=dp[i-1][dp[i-1].length-1]+dp[i][dp[i].length-1];
		}
		for(int i=2;i<n;i++) {
			for(int j=1;j<dp[i].length-1;j++) {
				dp[i][j]=Math.max(dp[i-1][j-1],dp[i-1][j])+dp[i][j];
			}
		}
		int max=0;
		for(int i=0;i<n;i++) {
			max=Math.max(max,dp[n-1][i]);
		}
		System.out.println(max);
	}
}
