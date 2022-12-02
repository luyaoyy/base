package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

//力扣 https://leetcode-cn.com/problems/coin-change/
public class W零钱兑换 {
	public static int fun(int[] coin, int sum) {
		int[] amount = new int[sum + 1];
		Arrays.fill(amount, sum + 1);
		for (int i = 1; i <= sum; i++) {
			for (int j = 0; j < coin.length; j++) {
				if (i - coin[j] >= 0) {
					amount[i] = Math.min(amount[i], amount[i - coin[j]] + 1);
				}
			}
		}
		return amount[sum] == sum + 1 ? -1 : amount[sum];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coin = new int[n];
		for (int i = 0; i < n; i++)
			coin[i] = sc.nextInt();
		int sum = sc.nextInt();
		System.out.println(fun(coin, sum));
	}
}
