package vjudge5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4136
public class W11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long R = Long.valueOf(br.readLine());
		int N = Integer.valueOf(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++)
			arr[i] = br.readLine();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int W = Integer.valueOf(arr[i].split(" ")[2]);
			int H = Integer.valueOf(arr[i].split(" ")[3]);
			sum += W * H;
		}
		long min = 0;long max = R;
		long ans = 0, leftArea = 0;
		while (min + 1 < max) {
			long mid = (min + max) / 2;
			int left = 0;
			for (int i = 0; i < arr.length; i++) {
				long L = Integer.valueOf(arr[i].split(" ")[0]);
				long W = Integer.valueOf(arr[i].split(" ")[2]);
				long H = Integer.valueOf(arr[i].split(" ")[3]);
				if (L + W <= mid) {
					left += W * H;
				} else if (mid > L && mid < (L + W)) {
					left += (mid - L) * H;
				}
			}
			if (left * 2 >= sum) {
				max = mid;
				ans = mid;
				leftArea = left;
			} else {
				min = mid;
			}
		}
		while (true) {
			ans++;
			long left = 0;
			for (int i = 0; i < arr.length; i++) {
				int L = Integer.valueOf(arr[i].split(" ")[0]);
				int W = Integer.valueOf(arr[i].split(" ")[2]);
				int H = Integer.valueOf(arr[i].split(" ")[3]);
				if (L + W <= ans) {
					left += W * H;
				} else if (ans > L && ans < (L + W)) {
					left += (ans - L) * H;
				}
			}
			if (left != leftArea) {
				System.out.println(ans-1);
				break;
			}
		}
	}
}
