import java.util.Scanner;

public class W最大岛屿面积 {
	static boolean[][] vis;
	static int[][] map;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int maxArea;
	static int area;

	public static void dfs(int x, int y) {
		if (vis[x][y])
			return;
		vis[x][y] = true;
		area++;
		for (int i = 0; i <= 3; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			dfs(xx, yy);
		}
	}

	public static int maxAreaOfIsland(int[][] grid) {
		int n = grid.length, m = grid[0].length;
		map = new int[n + 2][m + 2];
		vis = new boolean[n + 2][m + 2];
		maxArea = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j] = grid[i - 1][j - 1];
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (map[i][j]==1&&!vis[i][j]) {
					area = 0;
					dfs(i, j);
					maxArea = Math.max(area, maxArea);
				}
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] grid = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		System.out.println(maxAreaOfIsland(grid));
	}
}
