package vjudge2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class w05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int n = sc.nextInt(), k = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			int[] a = new int[arr.length];
			for (int u = 0; u < arr.length; u++) {
				a[u] = Integer.valueOf(arr[u]);
			}
			while (k != 0) {
				k--;
				boolean flag = true;
				for (int j = a.length - 1; j >= 1; j--) {
					if (a[j] > a[j - 1]) {
						int[] b = new int[a.length - 1 - j];
						int index = j;
						flag = false;
						boolean flag1 = true;
						int id = 0;
						for (int u = index + 1; u < a.length; u++) {
							b[id] = a[u];
							id++;
						}
						Arrays.sort(b);
						for (int v = 0; v < b.length; v++) {
							boolean flag2 = flag;
							if (b[v] > a[index - 1]) {
								flag2 = true;
								for (int c = index + 1; c < a.length; c++) {
									if (a[c] == b[v]) {
										int t = a[c];
										a[c] = a[index - 1];
										a[index - 1] = t;
										flag1 = false;
										break;
									}
								}
							}
							if (flag2)
								break;
						}
						if (flag1) {
							int t = a[index - 1];
							a[index - 1] = a[index];
							a[index] = t;
						}
						Arrays.sort(a, index, a.length);
						break;
					}
				}
				if (flag) {
					Arrays.sort(a);
				}
			}
			for (int y = 0; y < a.length; y++) {
				if (y != a.length - 1) {
					System.out.print(a[y] + " ");
				} else
					System.out.print(a[y]);
			}
			System.out.println();
		}
	}
}
