import java.math.BigInteger;
import java.util.Scanner;
//给出a,b,c。令p=1000000007, z=b^c, y=a^z, x=y mod p。请求出x。 即求幂中幂
public class 幂幂 {
	static BigInteger div = BigInteger.valueOf(2);

	public static BigInteger fun(BigInteger base, BigInteger power, BigInteger p) {
		BigInteger res = BigInteger.valueOf(1);
		while (power.compareTo(BigInteger.ZERO) != 0) {
			if (power.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
				power = power.divide(div);
				base = base.pow(2).mod(p);
			} else {
				power = power.divide(div);
				res = res.multiply(base).mod(p);
				base = base.pow(2).mod(p);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger(), c = sc.nextBigInteger();
		BigInteger p1 = BigInteger.valueOf(1000000007);
		BigInteger p2 = BigInteger.valueOf(1000000006);
		System.out.println(fun(a, fun(b, c, p2), p1));//自己体会结合p1 p2记忆
	}
}
