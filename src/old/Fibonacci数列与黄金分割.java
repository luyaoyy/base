import java.math.BigDecimal;
import java.util.Scanner;

public class Fibonacci������ƽ�ָ� {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigDecimal a=sc.nextBigDecimal();
		BigDecimal b=sc.nextBigDecimal();
		String s=a.divide(b,900000, BigDecimal.ROUND_CEILING).toString();
		System.out.println(s);

	}
}
