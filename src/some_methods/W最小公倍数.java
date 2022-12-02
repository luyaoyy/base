package w一些方法;

import java.math.BigInteger;
import java.util.Scanner;
//蓝桥杯 http://lx.lanqiao.cn/problem.page?gpid=T3073
//两个数的最小公倍数是最大公因数的倍数。并且两个数的最大公因数乘以最小公倍数等于这两个数的乘积 可以利用这个求两数
//最小公倍数；
public class W最小公倍数 {
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
