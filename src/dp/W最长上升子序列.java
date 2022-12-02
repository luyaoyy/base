package 动态规划;

import java.util.Scanner;

public class W最长上升子序列 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		int[] dp=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(num[j]<num[i]) {
					dp[i]=Math.max(dp[j]+1,dp[i]);
				}
			}
		}
		int max=0;
		for(int i:dp) {
			max=Math.max(i, max);
		}
		System.out.println(max);
	}
}
