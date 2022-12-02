import java.util.Scanner;

public class 自然数拆分 {
	static int n;
	static int cas;
	static int[][] ans;
	static int money;
	static int[] sum;
	static int[] num;

	static void dfs(int x) {
		if (money > n || x > n - 1) {
			return;
		}
		if (money == n) {
			for (int i = 1; i <= n - 1; i++) {
				ans[cas][i] = sum[i];
			}
			cas++;
			return;
		}
		sum[x]++;
		money += num[x];
		dfs(x);
		sum[x]--;
		money -= num[x];
		dfs(x + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = new int[n];
		sum = new int[n];
		ans = new int[1000000][n];
		for (int i = 1; i <= n - 1; i++)
			num[i] = i;
		dfs(1);
		for (int i = 0; i < cas; i++) {
			String s = "";
			for (int j = 1; j <= n - 1; j++) {
				if (ans[i][j] != 0) {
					for (int k = 0; k < ans[i][j]; k++) {
						s += j + "+";
					}
				}
			}
			System.out.println(s.substring(0,s.length()-1));
		}
	}
}
