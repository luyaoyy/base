package vjudge4;

import java.util.Scanner;

public class w06 {
	public static int fun(int n) {
		if(n==1||n==2)
			return 1;
		else
			return fun(n-1)+fun(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			int n=sc.nextInt();
			System.out.println(fun(n));
		}
	}
}
