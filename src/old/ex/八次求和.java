import java.math.BigInteger;
import java.util.Scanner;

public class �˴���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger ans = BigInteger.valueOf(0);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ans = ans.add(BigInteger.valueOf(i + 1).pow(8)).mod(BigInteger.valueOf(123456789));
		}
		System.out.println(ans);// ǰ��mod�������ʱҲҪmod!!
	}
}
