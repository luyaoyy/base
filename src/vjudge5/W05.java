package vjudge5;
import java.util.Scanner;

//1905
public class W05{
	public static double fun(double r, double L1,double L) {
		return L1-2*r*Math.asin(L/2/r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double L = sc.nextDouble(), n = sc.nextDouble(), C = sc.nextDouble();
			if (L == -1)
				break;
			else {
				if (n == 0) {
					System.out.println("0.000");
				} else {
					double L1 = L * (1 + n * C);
					double min = 0, max = L/2;
					double mid=0;
					while (max-min>=1e-6) {
						mid = (max + min) / 2;
						double r = (L * L + 4 * mid * mid) / (8 * mid);
						if (fun(r, L1,L) > 0) {
							min = mid;
						} else if (fun(r, L1,L) < 0)
							max = mid;
					}
					System.out.println(String.format("%.3f", mid));
				}

			}
		}
	}
}