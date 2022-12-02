import java.util.Scanner;

public class รินฌ {
	static char[][] map;
	static boolean[][] vis;
	static int ans;

	public static void dfs(int x, int y) {
		if (x < 0 || x >= 10 || y < 0 || y >= 10) {
			ans++;
			return;
		}
		if (vis[x][y]) {
			return;
		}
		if (map[x][y] == 'U') {
			vis[x][y] = true;
			int xx = x - 1, yy = y;
			dfs(xx, yy);
		}
		if (map[x][y] == 'D') {
			vis[x][y] = true;
			int xx = x + 1, yy = y;
			dfs(xx, yy);
		}
		if (map[x][y] == 'L') {
			vis[x][y] = true;
			int xx = x, yy = y - 1;
			dfs(xx, yy);
		}
		if (map[x][y] == 'R') {
			vis[x][y] = true;
			int xx = x, yy = y + 1;
			dfs(xx, yy);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new char[10][10];
		for (int i = 0; i < 10; i++) {
			String s = sc.next();
			for (int j = 0; j < 10; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				vis = new boolean[10][10];
				dfs(i, j);
			}
		}
		System.out.println(ans);
	}
}
