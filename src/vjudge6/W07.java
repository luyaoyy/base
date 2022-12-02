package vjudge6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class W07 {
	static Comparator<String> C = new Comparator<String>() {
		public int compare(String s1, String s2) {
			return Double.valueOf(s1.split(" ")[0]) / Double.valueOf(s1.split(" ")[1]) > Double
					.valueOf(s2.split(" ")[0]) / Double.valueOf(s2.split(" ")[1]) ? -1 : 1;
		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int W = sc.nextInt(), N = sc.nextInt();
			sc.nextLine();
			ArrayList<String> list = new ArrayList<>();
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			for (int i = 0; i < 2 * N; i += 2)
				list.add(arr[i + 1] + " " + arr[i]);
			Collections.sort(list, C);
			double w = 0, v = 0;
			for (int i = 0; i < N; i++) {
				if (W - w > 0) {
					if (Integer.valueOf(list.get(i).split(" ")[1]) < W - w) {
						w += Integer.valueOf(list.get(i).split(" ")[1]);
						v += Integer.valueOf(list.get(i).split(" ")[0]);
					} else {
						double yu = W - w;
						v += yu * Double.valueOf(list.get(i).split(" ")[0]) / Double.valueOf(list.get(i).split(" ")[1]);
						w = W;
					}
				} else {
					break;
				}
			}
			System.out.println(String.format("%.2f", v));
			n--;
		}
	}
}
