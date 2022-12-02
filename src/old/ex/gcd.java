import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger base = sc.nextBigInteger(), power = sc.nextBigInteger(), c = sc.nextBigInteger();
		BigInteger result = BigInteger.valueOf(1);
		while (power.compareTo(BigInteger.ZERO) != 0) {
			if (power.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
				power = power.divide(BigInteger.valueOf(2));
				base = base.pow(2).mod(c);
			} else {
				power = power.subtract(BigInteger.valueOf(1));
				power = power.divide(BigInteger.valueOf(2));
				result = result.multiply(base).mod(c);
				base = base.pow(2).mod(c);
			}
		}
		System.out.println(result);
	}
}
