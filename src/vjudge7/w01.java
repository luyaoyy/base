package vjudge7;

import java.util.Scanner;

public class w01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] dp=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					dp[i]=Math.max(dp[i],dp[j]+1);
				}
			}
		}
		int max=0;
		for(int i:dp)
			max=Math.max(i, max);
		System.out.println(max);
	}
}
