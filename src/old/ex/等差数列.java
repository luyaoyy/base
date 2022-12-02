import java.util.Arrays;
import java.util.Scanner;

public class µÈ²îÊýÁÐ {
	public static void main(String[] args) {
		// 2 4 6 10 20
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		sc.nextLine();
		String s = sc.nextLine();
		String[] split = s.split("\\s+");
		for (int i = 0; i < n; i++)
			num[i] = Integer.valueOf(split[i]);
		Arrays.sort(num);
		boolean flag = true;
		for (int i = 0; i < n - 1; i++) {
			if (num[i] != num[i + 1])
				flag = false;
		}
		if (flag) {
			System.out.println(n);
			return;
		}
		int max = 0;
		for (int i = 0; i < n - 1; i++)
			max = Math.max(max, num[i + 1] - num[i]);
		for (int i = 1;; i++) {
			if (max / (double) i % 1 != 0)
				continue;
			int d = max / i;
			int len = 1;
			int item = num[0];
			int id = 1;
			while (true) {
				item += d;
				if (id == n) {
					System.out.println(len);
					return;
				}
				len++;
				if (item == num[id]) {
					id++;
				}
				if (item > num[n - 1])
					break;
			}
		}
	}
}
