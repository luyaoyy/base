import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class 因数平方和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger sum = new BigInteger("0");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum=sum.add(new BigInteger(new BigInteger(i+"").multiply(new BigInteger(i+"")).toString()));
			}
		}
		System.out.println(sum.mod(new BigInteger("1000000007")));
	}
}
