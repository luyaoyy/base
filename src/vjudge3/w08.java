package vjudge3;

import java.util.Scanner;

public class w08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int sum=0;
		for(int i=0;i<=1000;i++) {
			for(int j=0;j<=1000;j++) {
				if((i*a+j*b)==c) {
					sum+=1;
				}
			}
		}
		System.out.println(sum);
	}
}
