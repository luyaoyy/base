import java.math.BigInteger;
import java.util.Scanner;

public class 阶乘约数 {
	static boolean fun(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			int num = i;
			if (fun(num)) {
				a[num]++;
				continue;
			}
			for (int j = 2; j <= num; j++) {//不能写j<=Math.sqrt(num)必须要等号，这样最后一个因子才能计算到
				if (fun(num)) {
					a[num]++;
					break;
				} else {
					if (num % j == 0) {
						num = num / j;
						a[j]++;
						j = 1;//使  j++后，j=2重新开始循环，不能写j==2
					}
				}
			}
		}
		BigInteger b = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			if (a[i] != 0)
				b = b.multiply(BigInteger.valueOf(a[i] + 1));
		}
		System.out.println(b);
	}
}
