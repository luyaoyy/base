import java.util.*;

public class WcbBFS {
	static int N = 51, M = N * N;
	static int[][] g = new int[N][N];
	static boolean[][] st = new boolean[N][N];
	static Queue<int[]> q = new LinkedList<>();
	static int n, m;
	static int res, cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				g[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!st[i][j]) {

					res = Math.max(res, bfs(i, j));
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(res);
	}

	static int bfs(int a, int b) {
		int num = 0; // 西1 北2 东4 南8 顺序一定不能错 后面位运算根据这个来进行的 
		int[] dy = { -1, 0, 1, 0 };
		int[] dx = { 0, -1, 0, 1 };
		q.offer(new int[] { a, b });
		st[a][b] = true;
		num++;
		while (!q.isEmpty()) {
			int[] poll = q.poll();
			int x = poll[0];
			int y = poll[1];

			for (int i = 0; i < 4; i++) {
				int tx = x + dx[i];
				int ty = y + dy[i];
				if (tx >= 0 && tx < n && ty >= 0 && ty < m) {
					if ((g[x][y] >> i & 1) == 0 && !st[tx][ty]) {
						q.offer(new int[] { tx, ty });
						st[tx][ty] = true;
						num++;
					}
				}
			}
		}
		return num;
	}
}
