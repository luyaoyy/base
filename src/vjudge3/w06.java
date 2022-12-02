package vjudge3;

import java.util.Scanner;

public class w06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		for(int a=0;a<=n;a++) {
			for(int b=0;b<=n;b++) {
				for(int c=0;c<=n;c++) {
					if((a + b) % 2 == 0 && (b + c) % 3 == 0 && (a + b + c) % 5 == 0) {
						if(a+b+c>max)
							max=a+b+c;
					}
				}
			}
		}
		System.out.println(max);
	}
}
