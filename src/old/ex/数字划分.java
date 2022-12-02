
public class Êý×Ö»®·Ö {
	static int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
	static int[] ans;
	static boolean[] vis;
	static int k;

	public static void dfs(int a) {
		if (a == k) {
			for (int i = 0; i < k; i++) {
				vis[ans[i]] = true;
			}
			if (judge(ans)) {
				for (int i = 0; i < k; i++)
					System.out.print(num[ans[i]] + " ");
				System.out.println();
			}
			return;
		}
		for (int i = ans[a - 1 < 0 ? 0 : a - 1]; i < 16; i++) {
			if (!vis[i]) {
				vis[i] = true;
				ans[a] = i;
				dfs(a + 1);
				vis[i] = false;
			}
		}
	}

	public static boolean judge(int[] arr) {
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < 16; i++) {
			if (!vis[i]) {
				sum1 += Math.pow(num[i], 2) + Math.pow(num[i], 3) + num[i];
			} else {
				sum2 += Math.pow(num[i], 2) + Math.pow(num[i], 3) + num[i];
			}
		}
		if (sum1 == sum2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		k = 8;
		ans = new int[k];
		vis = new boolean[16];
		dfs(0);
	}
}
