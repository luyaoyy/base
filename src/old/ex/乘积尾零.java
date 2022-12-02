import java.math.BigInteger;
import java.util.Scanner;

public class ³Ë»ýÎ²Áã {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger ans = BigInteger.valueOf(1);
		for (int i = 0; i < 100; i++)
			ans = ans.multiply(sc.nextBigInteger());
		int sum=0;
		for (int i = ans.toString().length() - 1; i >= 0; i--) {
			if (ans.toString().charAt(i) != '0')
				break;
			else
				sum++;
		}
		System.out.println(sum);
	}
}
