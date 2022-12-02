package vjudge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class w03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int a = 2; a <= n; a++) {
			for (int b = 2; b <= n; b++) {
				for (int c = 2; c <= n; c++) {
					for (int d = 2; d <= n; d++) {
						if (a * a * a == b * b * b + c * c * c + d * d * d) {
							int[] arr = { b, c, d };
							Arrays.sort(arr);
							String str = String.valueOf(arr[0] + String.valueOf(arr[1]) + String.valueOf(arr[2]));
							if (!list.contains(str)) {
								System.out.println("Cube = " + a + "," + " Triple = (" + b + "," + c + "," + d + ")");
								list.add(str);
							}
						}
					}
				}
			}
		}
	}
}
