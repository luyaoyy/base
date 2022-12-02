import java.math.BigInteger;

public class ¸´ÊýÃÝ {
	public static void main(String[] args) {
		BigInteger a=BigInteger.valueOf(2),b=BigInteger.valueOf(3),c=BigInteger.valueOf(2),d=BigInteger.valueOf(3);
		int i=123455;
		while(i--!=0) {
			BigInteger a_=a,b_=b;
			a=(a_.multiply(c).subtract(b_.multiply(d)));
			b=b_.multiply(c).add(a_.multiply(d));
		}
		System.out.println(a+"+"+b+"i");
	}
}
