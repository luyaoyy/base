import java.math.BigInteger;

public class 数列求值 {
	public static void main(String[] args) {
		int a1=1,a2=1,a3=1;
		int a4 = 0;
		for(int i=4;i<=20190324;i++) {
			a4=a1+a2+a3;
			a4%=10000;
			a1=a2;
			a2=a3;
			a3=a4;
		}
		System.out.println(a4);
	}
}
