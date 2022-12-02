package vjudge6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class W01 {
	static Comparator<String> C = new Comparator<String>() {
		public int compare(String s1, String s2) {
			return Integer.valueOf(s1.split(" ")[0]) / Integer.valueOf(s1.split(" ")[1]) > Integer
					.valueOf(s2.split(" ")[0]) / Integer.valueOf(s2.split(" ")[1]) ? -1 : 1;
		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), W = sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++)
			list.add(sc.nextLine());
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
		System.out.println(String.format("%.1f", v));
	}
}
