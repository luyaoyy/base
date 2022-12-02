package 动态规划;

import java.util.Scanner;
import java.util.Scanner;

public class W装箱问题 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V=sc.nextInt(),n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=sc.nextInt();
		int[][] dp=new int[V+1][n+1];
		for(int i=1;i<=V;i++) {
			for(int j=1;j<=n;j++) {
				if(i-arr[j]>=0)
					dp[i][j]=Math.max(dp[i-arr[j]][j-1]+arr[j], dp[i][j-1]);
				else
					dp[i][j]=dp[i][j-1];
			}
		}
		System.out.println(V-dp[V][n]);
	}

}
