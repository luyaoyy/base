package vjudge2;

import java.util.Scanner;

public class w03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			int[] ar = { 0, 5, 3, 1 };
			String[] arr = str.split(" ");
			int a = Integer.valueOf(arr[0]), b = Integer.valueOf(arr[1]), c = Integer.valueOf(arr[2]),
					d = Integer.valueOf(arr[3]), e = Integer.valueOf(arr[4]), f = Integer.valueOf(arr[5]);
			if(a==0&&b==0&&c==0&&d==0&&e==0&&f==0)
				break;
			else {
				int sum = 0;
				sum = f + e + d + c / 4;
				int one = 11 * e, two = 5 * d;
				int i = c % 4;
				two += ar[i];
				if (b > two) {
					int yu=b-two;
					sum+=yu/9;
					one+=yu%9*4;
				}
				if(a>one) {
					int yu1=a-one;
					sum+=yu1/36+1;
				}
				System.out.println(sum);
			}
		}
	}
}
