import java.util.Scanner;

public class Լ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += n/i;
		}
		System.out.println(sum%1000000007);
	}
}