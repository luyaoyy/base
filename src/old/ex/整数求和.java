import java.util.Scanner;

public class 整数求和 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] num=new int[n+1];
		for(int i=1;i<=n;i++)
			num[i]=i;
		int[][] dp=new int[n+1][m+1];
		dp[0][0]=1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(num[i]<=j)
					dp[i][j]=dp[i-1][j]+dp[i-1][j-num[i]];
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[n][m]);
	}
}
