package vjudge7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class w09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		while (T != 0) {
			String s=br.readLine();
			int n = Integer.valueOf(s.split(" ")[0]), k = Integer.valueOf(s.split(" ")[1]);
			int[] p = new int[n];
			int[] v = new int[n];
			String s1 = br.readLine();
			String s2 = br.readLine();
			String[] arr1 = s1.split(" ");
			String[] arr2 = s2.split(" ");
			for (int i = 0; i < n; i++)
				p[i] = Integer.valueOf(arr1[i]);
			for (int i = 0; i < n; i++)
				v[i] = Integer.valueOf(arr2[i]);
			int[] dp = new int[n];
			for (int i = 0; i < n; i++) {
				dp[i] = v[i];
				for (int j = i; j >= 0; j--) {
					if (p[i] - p[j] > k) {
						dp[i] = Math.max(dp[i], dp[j] + v[i]);
					}
				}
			}
			int max = 0;
			for (int i : dp)
				max = Math.max(i, max);
			System.out.println(max);
			T--;
		}
	}
}
