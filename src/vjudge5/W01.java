package vjudge5;

import java.util.Scanner;

public class W01 {
	// f(x) = x3-5x2+10x-80 = 0;
	// f(5)<0 f(6)>0 解在5~6之间
	public static double fun(double x) {
		return Math.pow(x, 3) - 5 * x * x + 10 * x - 80;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double left = 5, right = 6;
		while (true) {
			double left_ = left, right_ = right;
			right = fun((right_ - left_) / 2 + left_) > 0 ? (left_ + (right_ - left_) / 2) : right_;
			left = fun((right_ - left_) / 2 + left_) > 0 ? left_ : (left_ + (right_ - left_) / 2);
			if (String.valueOf((right_ - left_) / 2 + left_).length() >= 9
					&& Math.abs(fun((right_ - left_) / 2 + left_)) <= 1e-10) {
				System.out.println(String.format("%.9f", (right_ - left_) / 2 + left_));
				break;
			}
		}
	}
}
