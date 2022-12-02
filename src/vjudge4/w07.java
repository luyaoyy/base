package vjudge4;

import java.util.Scanner;

public class w07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt();
			int max=a > b ? b : a;
			for (int i = max; i >= 1; i--) {
				if(a%i==0&&b%i==0) {
					max=i;
					break;
				}
			}
			System.out.println(max);
		}
	}
}
