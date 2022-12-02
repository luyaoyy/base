
public class 路径计数 {
	static boolean[][] vis;
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };
	static int ans = 0;

	public static void dfs(int x, int y, int step) {
		if (step > 12)//步数大于12结束
			return;
		if (x == 0 && y == 0 && step > 2) {//满足条件且保证不是刚出来就回到起点 路径加1
			ans++;
			return;
		}
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i], yy = y + dy[i];
			if (xx < 0 || xx > 5 || yy < 0 || yy > 5)
				continue;
			if (!vis[xx][yy]) {
				vis[xx][yy] = true;
				dfs(xx, yy, step + 1);
				vis[xx][yy] = false;
			}
		}
	}

	public static void main(String[] args) {
		vis = new boolean[6][6];
		dfs(0, 0, 0);
		System.out.println(ans);
	}
}
