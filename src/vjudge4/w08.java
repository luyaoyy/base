package vjudge4;

import java.util.Scanner;
import java.util.Scanner;

public class w08{
	static int sum;

	public static void split(int n, int m) {
		for (int i = m; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum++;
				split(n / i, i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			sum = 1;
			split(n, 2);
			System.out.println(sum);
		}
	}
}