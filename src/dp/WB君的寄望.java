package 动态规划;

import java.math.BigInteger;
import java.util.Scanner;

public class WB君的寄望 {
	public static BigInteger fun(int n) {
		if (n == 0)
			return new BigInteger("0");
		if(n==1||n==2)
			return new BigInteger("1");
		BigInteger[] a = new BigInteger[n + 2];
		a[2] = new BigInteger("1");
		a[3] = new BigInteger("1");
		a[4] = new BigInteger("1");
		for (int i = 5; i <= n + 1; i++) {
			a[i] = a[i - 2].add(a[i-3]);
		}
		return a[n + 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fun(sc.nextInt()));
	}
}
