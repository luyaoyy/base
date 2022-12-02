package w一些方法;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class W贪心_会场安排 {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int k = in.nextInt();
		int[] begin = new int[k];
		int[] end = new int[k];

		for (int i = 0; i < k; i++) {
			begin[i] = in.nextInt();
			end[i] = in.nextInt();
		}
		// 两个都按升序排序
		Arrays.sort(begin);
		Arrays.sort(end);

		int times = 0;
		int j = 0;
		for (int i = 0; i < begin.length; i++) {
			if (begin[i] < end[j])
				times++;
			else
				j++;
		}
		System.out.println(times);
	}
}
