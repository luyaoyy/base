package 动态规划;

import java.util.Scanner;

public class W障碍走方格 {
	public static int dp(int[][] a) {
		int m=a.length;
		int n=a[0].length;
		int[][] dp=new int[m][n];
		for(int i=0;i<m;i++) {
			if(a[i][0]==0)
				dp[i][0]=1;
			else
				break;//break很重要
		}
		for(int i=0;i<n;i++) {
			if(a[0][i]==0)
				dp[0][i]=1;
			else
				break;
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(a[i][j]==0) {
					dp[i][j]=dp[i-1][j]+dp[i][j-1];
				}
			}
		}
		return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println(dp(a));
	}
}
