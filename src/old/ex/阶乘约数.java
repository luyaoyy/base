import java.math.BigInteger;
import java.util.Scanner;

public class �׳�Լ�� {
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
			for (int j = 2; j <= num; j++) {//����дj<=Math.sqrt(num)����Ҫ�Ⱥţ��������һ�����Ӳ��ܼ��㵽
				if (fun(num)) {
					a[num]++;
					break;
				} else {
					if (num % j == 0) {
						num = num / j;
						a[j]++;
						j = 1;//ʹ  j++��j=2���¿�ʼѭ��������дj==2
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
