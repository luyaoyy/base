
public class 平方拆分背包解法 {
	public static void main(String[] args) {
		int[] num=new int[46];//存放平方数
		for(int i=0;i<=45;i++)
			num[i]=i*i;
		long[][] dp=new long[46][2020];//动态规划解法 dp[i][j]表示前i个平方数组成和为j的不同组合数
		dp[0][0]=1;
		for(int i=1;i<=45;i++) {
			for(int j=0;j<=2019;j++) {
				if(j>=num[i])
					dp[i][j]=dp[i-1][j]+dp[i-1][j-num[i]];
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[45][2019]);
	}
}
