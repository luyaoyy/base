
public class ƽ����ֱ����ⷨ {
	public static void main(String[] args) {
		int[] num=new int[46];//���ƽ����
		for(int i=0;i<=45;i++)
			num[i]=i*i;
		long[][] dp=new long[46][2020];//��̬�滮�ⷨ dp[i][j]��ʾǰi��ƽ������ɺ�Ϊj�Ĳ�ͬ�����
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
