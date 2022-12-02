package vjudge5;

import java.util.Arrays;
import java.util.Scanner;

public class W03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		long[] d = new long[n];
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			a[i] = Long.valueOf(arr[0]);
			b[i] = Long.valueOf(arr[1]);
			c[i] = Long.valueOf(arr[2]);
			d[i] = Long.valueOf(arr[3]);
		}
		long[] A = new long[n * n];
		long[] B = new long[n * n];
		int id = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[id] = a[i] + b[j];
				B[id] = c[i] + d[j];
				id++;
			}
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int all = 0;
		for (int i = 0; i < A.length; i++) {
			int min = 0, max = B.length - 1;
			while (min <= max) {
				int mid = (max + min) / 2;
				if (B[mid] + A[i] > 0)
					max = mid - 1;
				else if (B[mid] + A[i] < 0)
					min = mid + 1;
				else {
					all++;
					int j = mid - 1;
					while (j >= 0) {
						if (B[j] + A[i]==0) {
							all++;
							j--;

						} else
							break;
					}
					j = mid + 1;
					while (j <= B.length - 1) {
						if (B[j] + A[i]==0) {
							all++;
							j++;
						} else
							break;
					}
					break;
				}
			}
		}
		System.out.println(all);
	}
}
