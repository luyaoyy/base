
public class 拼接 {
	static boolean[][] vis;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int ans;

	public static void dfs(int x, int y) {
		if (x == 0 || y == 7) {//能到边界 分割方法加1
			ans++;
			return;
		}
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i], yy = y + dy[i];
			if (xx < 0 || xx > 7 || yy < 0 || yy > 7)//越界处理
				continue;
			if (vis[xx][yy] || xx == yy)//已经访问过的不再访问
				continue;
			vis[xx][yy] = true;
			dfs(xx, yy);
			vis[xx][yy] = false;
		}
	}

	public static void main(String[] args) {
		vis = new boolean[8][8];
		for (int i = 0; i < 8; i++) {// 从正方形左上角到右下角对角线出发 判断是否能到边界
			vis[i][i] = true;
			dfs(i, i);
		}
		System.out.println(ans);
	}
}
