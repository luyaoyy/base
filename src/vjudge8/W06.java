import java.util.Scanner;

public class W06 {
	static int sum;
	static int n;
	static int k;
	static char[][] map;
	static boolean[] vis;

	public static void dfs(int x, int num) {
		if (num == k) {
			sum++;
			return;
		}
		for (int i = x; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == '#' && !vis[j]) {
					vis[j] = true;
					dfs(i + 1, num + 1);
					vis[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			k = sc.nextInt();
			if (n == -1 && k==-1)
				break;
			map = new char[n][n];
			vis = new boolean[n];
			sum = 0;
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < n; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			dfs(0, 0);
			System.out.println(sum);
		}
	}
}
