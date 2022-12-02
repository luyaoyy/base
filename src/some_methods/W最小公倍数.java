package wһЩ����;

import java.math.BigInteger;
import java.util.Scanner;
//���ű� http://lx.lanqiao.cn/problem.page?gpid=T3073
//����������С����������������ı������������������������������С�������������������ĳ˻� �����������������
//��С��������
public class W��С������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] dp = new BigInteger[n + 1];
		dp[1] = new BigInteger("1");
		dp[2] = new BigInteger("2");
		dp[3] = new BigInteger("6");
		for (int i = 4; i <= n; i++) {
			BigInteger max=dp[i-1].gcd(new BigInteger(i+""));
			BigInteger min=new BigInteger(i+"").multiply(dp[i-1]).divide(max);
			dp[i]=min;
		}
		System.out.println(dp[n].toString());
	}
}
