package 动态规划;

import java.util.Scanner;

//给定两个字符串，已知可以使用三种方式进行变换
//1. 插入一个字符
//2. 删除一个字符
//3. 更改一个字符
//请设计一个算法，找到两个字符串之间的经历几次最小变换，可以字符串 1 转换成字符串 2 
public class 字符变化最小步数 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		int l1=s1.length(),l2=s2.length();
		int[][] dp=new int[l1+1][l2+1];
		for(int i=0;i<=l1;i++) {
			for(int j=0;j<=l2;j++) {
				dp[i][j]=100000000;
			}
		}
		for(int i=0;i<=l1;i++)
			dp[i][0]=i;
		for(int j=0;j<=l2;j++)
			dp[0][j]=j;
		for(int i=1;i<=l1;i++) {
			for(int j=1;j<=l2;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else {
					dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+1;
				}
			}
		}
		System.out.println(dp[l1][l2]);
	}
}
