package vjudge3;

import java.util.Scanner;

public class w07 {
	static boolean judge(int a) {
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			return true;
		}else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		for (int i = 2; i <= n - 2; i++) {
			int j = n - i;
			if (judge(i) && judge(j)) {
				if (max < i * j)
					max = i * j;
			}
		}
		System.out.println(max);
	}
}
