
import java.math.BigInteger;
import java.util.Scanner;

public class �������� {
	public static BigInteger a1(int i) {// �ڱ߳�Ϊi�Ĵ��������У����㶼�ڴ������α߳��ϵ�����������i��
		return BigInteger.valueOf(i);
	}

	public static BigInteger a2(int n, int i) {// �ڴ��������У��߳�Ϊi���������ζ��㶼�ڴ��������ڲ�(��û�ж����ڱ߳���)����(n-i+1)*(n-i+1)��
		return BigInteger.valueOf(n - i + 1).pow(2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = n - 1;// �߳���n����������γ���Ϊn-1
		BigInteger ans = BigInteger.valueOf(0);
		for (int i = 1; i <= n; i++) {// ���������α߳�Ϊi��ʼ����һֱ��n
			ans = ans.add(a1(i).multiply(a2(n, i))).mod(BigInteger.valueOf(1000000007));// ��ͬ��ȡ�����������
		}
		System.out.println(ans);
	}
}