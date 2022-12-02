import java.util.Scanner;

public class 约数个数 {
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