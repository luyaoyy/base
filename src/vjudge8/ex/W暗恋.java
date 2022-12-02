import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class W°µÁµ {
	static boolean[][] vis;
	static int[][] map;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int maxArea;
	static int area;
	static int color;

	public static void dfs(int x, int y) {
		if (map[x][y] != color || vis[x][y]) {
			return;
		}
		vis[x][y] = true;
		area++;
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			dfs(xx, yy);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();
		vis = new boolean[n + 2][m + 2];
		map = new int[n + 2][m + 2];
		maxArea = 0;
		for (int i = 0; i <= m + 1; i++) {
			vis[0][i] = true;
			vis[n + 1][i] = true;
		}
		for (int i = 0; i <= n + 1; i++) {
			vis[i][0] = true;
			vis[i][m + 1] = true;
		}
		for (int i = 1; i <= n; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j + 1] = Integer.valueOf(arr[j]);
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (!vis[i][j]) {
					color = map[i][j];
					area = 0;
					dfs(i, j);
					maxArea = Math.max(maxArea, area);
				}
			}
		}
		System.out.println(maxArea);
	}
}
