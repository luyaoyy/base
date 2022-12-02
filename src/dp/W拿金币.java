package 动态规划;

import java.util.Scanner;

public class W拿金币 {
	public static void main(String[] args) {//其实可以直接用dp当地图
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] a=new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				a[i][j]=sc.nextInt();
		}
		int[][] dp=new int[N][N];
		dp[0][0]=a[0][0];
		for(int j=1;j<N;j++) {
			dp[0][j]=dp[0][j-1]+a[0][j];
		}
		for(int j=1;j<N;j++) {
			dp[j][0]=dp[j-1][0]+a[j][0];
		}
		for(int i=1;i<N;i++) {
			for(int j=1;j<N;j++) {
				dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1])+a[i][j];
			}
		}
		System.out.println(dp[N-1][N-1]);
	}
}
