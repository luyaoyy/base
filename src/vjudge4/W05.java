package vjudge4;

import java.util.Arrays;
import java.util.Scanner;

public class W05 {
	static double ESP = 1e-6;

	static boolean isZero(double x) {
		return Math.abs(x) <= ESP;
	}

	static boolean point(double[] a, int n) {
		if (n == 1) {
			if (isZero(a[0] - 24))
				return true;
			else
				return false;
		}
		double[] b = new double[4];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int m = 0;
				for (int k = 0; k < n; k++) {
					if (k != i & k != j)
						b[m++] = a[k];
				}
				b[m] = a[i] + a[j];
				if (point(b, m + 1))
					return true;
				b[m] = a[i] - a[j];
				if (point(b, m + 1))
					return true;
				b[m] = a[j] - a[i];
				if (point(b, m + 1))
					return true;
				b[m] = a[i] * a[j];
				if (point(b, m + 1))
					return true;
				if (!isZero(a[i])) {
					b[m] = a[j] / a[i];
					if (point(b, m + 1))
						return true;
				}
				if (!isZero(a[j])) {
					b[m] = a[i] / a[j];
					if (point(b, m + 1))
						return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[4];
		double[] x = new double[4];
		while (sc.hasNext()) {
			String str = sc.nextLine();
			arr = str.split(" ");
			x[0] = Double.valueOf(arr[0]);
			x[1] = Double.valueOf(arr[1]);
			x[2] = Double.valueOf(arr[2]);
			x[3] = Double.valueOf(arr[3]);
			if (x[0] == 0 && x[1] == 0 && x[2] == 0 && x[3] == 0)
				break;
			else {
				if (point(x, 4))
					System.out.println("YES");
				if (!point(x, 4))
					System.out.println("NO");
			}
		}
	}
}
