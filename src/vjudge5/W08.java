package vjudge5;

//4142
import java.util.Scanner;

public class W08 {
	// f(x) = x5 - 15 * x4+ 85 * x3- 225 * x2+ 274 * x - 121
	public static double cal(double x) {
		return Math.pow(x, 5) - 15 * Math.pow(x, 4) + 85 * Math.pow(x, 3) - 225 * x * x + 274 * x - 121;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = 1.5, max = 2.4;
		while (min <= max) {
			double mid = (min + max) / 2;
			if (cal(mid) > 0)
				min = mid;
			else if (cal(mid) < 0)
				max = mid;
			if (Math.abs(cal(mid)) <= 1e-10 && (mid + "").length() >= 6) {
				System.out.println(String.format("%.6f", mid));
				break;
			}
		}
	}
}
