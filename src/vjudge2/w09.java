package vjudge2;

import java.util.Scanner;

public class w09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a, b, c, d, e, f;
		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			if (a < 0) {
				a = 0 - a;
				b = 0 - b;
				c = 0 - c;
			}
			d = b * b - 4 * a * c;
			e = (0 - b) / 2.0 / a;
			if (d > 0) {
				if(d<1e-8) {
					System.out.println("x1=x2=" + String.format("%.5f", e));
				}else {
					f = Math.sqrt(d) / 2.0 / a;
					System.out.println("x1="+String.format("%.5f", e + f) + ";" +"x2="+ String.format("%.5f", e - f));
				}
			} else if (Math.abs(d) < 1e-8) {
				System.out.println("x1=x2=" + String.format("%.5f", e));
			} else {
				f = Math.sqrt(Math.abs(d)) / 2.0 / a;
				if (b == 0) {
					System.out.println("x1=" + String.format("%.5f", f) + "i" + ";" + "x2=" + "-"
							+ String.format("%.5f", f) + "i");
				} else {
					System.out.println("x1=" + String.format("%.5f", e) + "+" + String.format("%.5f", f) + "i" + ";"
							+ "x2=" + String.format("%.5f", e) + "-" + String.format("%.5f", f) + "i");
				}
			}
		}
	}
}