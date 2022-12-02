package vjudge5;

public class W01_ {
	public static double fun(double l, double r) {
		double x = (l + r) / 2;
		double ll = l,rr = r;
		if (r-l <= 1e-11)
			return x;
		else {
			if (Math.pow(x, 3) - 5 * x * x + 10 * x - 80 > 0)
				rr = x;
			else
				ll = x;
			return fun(ll, rr);
		}
	}

	public static void main(String[] args) {
		System.out.println(String.format("%.9f", fun(5, 6)));
	}
}
