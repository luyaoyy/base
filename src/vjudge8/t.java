import java.util.Scanner;

public class t {
	static int n, k;
	static int[] ans;
	static boolean[] vis;

	public static void dfs(int a) {
		if (a == k) {
			for (int i : ans)
				System.out.print(i);
			System.out.println();
			return;
		}
		for (int j = ans[a - 1 < 0 ? 0 : a - 1]; j < n; j++) {
			if (!vis[j]) {
				ans[a] = j;
				vis[j] = true;
				dfs(a + 1);
				vis[j] = false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		vis = new boolean[n];
		ans = new int[k];
		dfs(0);
	}
}
