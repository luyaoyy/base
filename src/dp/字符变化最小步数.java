package ��̬�滮;

import java.util.Scanner;

//���������ַ�������֪����ʹ�����ַ�ʽ���б任
//1. ����һ���ַ�
//2. ɾ��һ���ַ�
//3. ����һ���ַ�
//�����һ���㷨���ҵ������ַ���֮��ľ���������С�任�������ַ��� 1 ת�����ַ��� 2 
public class �ַ��仯��С���� {
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
