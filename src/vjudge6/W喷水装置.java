package vjudge6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Point {
	double min;
	double max;

	public Point(double min, double max) {
		this.min = min;
		this.max = max;
	}
}

public class WÅçË®×°ÖÃ {
	static Comparator<Point> C = new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			return p1.min > p2.min ? 1 : -1;
		}
	};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine().trim());
		while (T != 0) {
			String s = br.readLine();
			int n = Integer.valueOf(s.split(" ")[0]);
			double L = Double.valueOf(s.split(" ")[1]);
			double W = Double.valueOf(s.split(" ")[2]);
			ArrayList<Point> point = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				s = br.readLine();
				double x = Double.valueOf(s.split(" ")[0]);
				double r = Double.valueOf(s.split(" ")[1]);
				if (r <= W / 2)
					continue;
				double min = x - Math.sqrt(r * r - W * W / 4);
				double max = x + Math.sqrt(r * r - W * W / 4);
				point.add(new Point(min, max));
			}
			Collections.sort(point, C);
			double star = 0, last;
			int count = 0;
			for (int i = 0; i < point.size(); i++) {
				if (point.get(i).min <= star) {
					last = point.get(i).max;
					while (point.get(i).min <= star) {
						last = Math.max(last, point.get(i).max);
						i++;
						if (i == point.size())
							break;
					}
					star = last;
					i--;
					count++;
				}
				if (star >= L)
					break;
			}
			if (star >= W)
				System.out.println(count);
			else
				System.out.println("-1");
			T--;
		}
	}
}
