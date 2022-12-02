package w一些方法;

import java.util.Scanner;

public class w筛法 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] Notprime=new boolean[n+1];//  Notprime[i] 含义:表示 数i是不是素数  true表示不是素数 false 表示是素数
		Notprime[0]=true;//0 1不是素数 
		Notprime[1]=true;
		int cnt=0;
		for(int i=2;i<=n;i++) {//从2开始筛法
			if(!Notprime[i]) {//  !isprime[i]=true表示i是素数  那么它的2倍 3倍 4倍。。。不是素数 记为true
				for(int j=2*i;j<=n;j+=i) {//一个数如果是素数，它的倍数（在n的范围内）就不是素数
					Notprime[j]=true;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {//统计素数个数
			if(!Notprime[i])
				cnt+=1;
		}
		System.out.println(cnt);//输出素数个数
	}
}
