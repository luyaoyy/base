package w一些方法;

import java.util.Scanner;

public class W分解质因数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] prime = new boolean[100000];
		for (int i = 2; i < 100000; i++) {
			if (!prime[i]) {
				for (int j = 2 * i; j < 100000; j += i)
					prime[j] = true;
			}
		}
		int n = sc.nextInt();
		int[] ans = new int[100];
		int id = 0;
		if (!prime[n])
			System.out.println(n);
		else {
			for (int i = 2;; i++) {
				if (!prime[n]) {
					ans[id++] = n;
					break;
				} else {
					if (n % i == 0) {
						ans[id++] = i;
						n /= i;
						i--;
					}
				}
			}
		}
		if (ans[0] != 0) {
			System.out.print(ans[0]);
			for (int i = 1; i < id; i++) {
				System.out.print("*" + ans[i]);
			}
		}
	}
}
