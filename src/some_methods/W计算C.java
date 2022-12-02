package w一些方法;

import java.util.Scanner;

public class W计算C {
	public static long fun(int n,int m) {
		long a=1;
		int m_=m;
		while(m_!=0) {
			a*=n;
			n--;
			m_--;
		}
		long b=1;
		for(int i=1;i<=m;i++)
			b*=i;
		return a/b;
	}
	public static void main(String[] args) {
		//Cnm
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		System.out.println(fun(n,m));
	}
}
