package vjudge3;

import java.util.ArrayList;
import java.util.Scanner;

public class w09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
		ArrayList<Integer> weight = new ArrayList<>();
		int sum = 0;
		for (int i1 = 0; i1 <= a; i1++) {
			for (int i2 = 0; i2 <= b; i2++) {
				for (int i3 = 0; i3 <= c; i3++) {
					for (int i4 = 0; i4 <= d; i4++) {
						for (int i5 = 0; i5 <= e; i5++) {
							for (int i6 = 0; i6 <= f; i6++) {
								int t = i1 * 1 + i2 * 2 + i3 * 3 + i4 * 5 + i5 * 10 + i6 * 20;
								if (!weight.contains(t)) {
									weight.add(t);
									sum++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Total="+(sum-1));
	}
}
