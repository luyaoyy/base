
import java.math.BigInteger;
import java.util.Scanner;

public class 数正方形 {
	public static BigInteger a1(int i) {// 在边长为i的大正方形中，顶点都在大正方形边长上的子正方形有i个
		return BigInteger.valueOf(i);
	}

	public static BigInteger a2(int n, int i) {// 在大正方形中，边长为i的子正方形顶点都在大正方形内部(即没有顶点在边长上)的有(n-i+1)*(n-i+1)个
		return BigInteger.valueOf(n - i + 1).pow(2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = n - 1;// 边长有n个点的正方形长度为n-1
		BigInteger ans = BigInteger.valueOf(0);
		for (int i = 1; i <= n; i++) {// 从子正方形边长为i开始数，一直到n
			ans = ans.add(a1(i).multiply(a2(n, i))).mod(BigInteger.valueOf(1000000007));// 求不同的取法，相乘求余
		}
		System.out.println(ans);
	}
}