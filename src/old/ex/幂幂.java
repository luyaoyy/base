import java.math.BigInteger;
import java.util.Scanner;

public class ÃÝÃÝ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger(), c = sc.nextBigInteger();
		BigInteger p = BigInteger.valueOf(1000000007);
		BigInteger res1 = BigInteger.valueOf(1);
		while (c.compareTo(BigInteger.ZERO) != 0) {
			if (c.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
				c = c.divide(BigInteger.valueOf(2));
				b = b.pow(2).mod(BigInteger.valueOf(1000000006));
			} else {
				c = c.divide(BigInteger.valueOf(2));
				res1 = res1.multiply(b).mod(BigInteger.valueOf(1000000006));
				b = b.pow(2).mod(BigInteger.valueOf(1000000006));
			}
		}
		c = res1;
		BigInteger ans = BigInteger.valueOf(1);
		while (c.compareTo(BigInteger.ZERO) != 0) {
			if (c.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
				c = c.divide(BigInteger.valueOf(2));
				a = a.pow(2).mod(p);
			} else {
				c = c.divide(BigInteger.valueOf(2));
				ans = ans.multiply(a).mod(p);
				a = a.pow(2).mod(p);
			}
		}
		System.out.println(ans);
	}
}
