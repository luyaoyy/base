import java.util.Scanner;

public class ·´±¶Êý {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % a != 0 && i % b != 0 && i % c != 0)
				sum++;
		}
		System.out.println(sum);
	}
}
