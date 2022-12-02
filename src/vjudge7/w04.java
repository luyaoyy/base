package vjudge7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point {
	int h;
	int x;
	int y;
}

public class w04 {
	static Comparator<Point> C = new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			return p1.h - p2.h;
		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();
		Point[] p = new Point[n * m];
		int[][] f = new int[n][m];
		int[][] len = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] h_ = s.split(" ");
			for (int j = 0; j < m; j++) {
				f[i][j] = Integer.valueOf(h_[j]);
				p[i * m + j] = new Point();
				p[i * m + j].h = Integer.valueOf(h_[j]);
				p[i * m + j].x = i;
				p[i * m + j].y = j;
				len[i][j] = 1;
			}
		}
		Arrays.sort(p, C);
		for (int i = 0; i < n * m; i++) {
			int x_ = p[i].x;
			int y_ = p[i].y;
			int h_ = p[i].h;
			if (x_ > 0 && f[x_ - 1][y_] < h_)
				len[x_][y_] = Math.max(len[x_][y_], len[x_ - 1][y_] + 1);
			if (x_ < n - 1 && f[x_ + 1][y_] < h_)
				len[x_][y_] = Math.max(len[x_][y_], len[x_ + 1][y_] + 1);
			if (y_ > 0 && f[x_][y_ - 1] < h_)
				len[x_][y_] = Math.max(len[x_][y_], len[x_][y_ - 1] + 1);
			if (y_ < m - 1 && f[x_][y_ + 1] < h_)
				len[x_][y_] = Math.max(len[x_][y_], len[x_][y_ + 1] + 1);
		}
		int max = len[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				max = Math.max(max, len[i][j]);
			}
		}
		System.out.println(max);
	}
}