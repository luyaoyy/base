import java.math.BigInteger;
import java.util.Scanner;

public class ÍøÂçÀ©ÕÅ {
	static int day;
	public static BigInteger fun(int d,BigInteger a1,BigInteger a2) {
		if(d==day) {
			return (a1.add(a2)).multiply(BigInteger.valueOf(2));
		}
		return fun(d+1,a2,a2.add(a1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		System.out.println(fun(0,BigInteger.valueOf(1),BigInteger.valueOf(0)));
	}
}
