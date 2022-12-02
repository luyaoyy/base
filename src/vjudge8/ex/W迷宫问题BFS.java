import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Site {
	int x, y;
	String road;

	public Site(int x, int y, String road) {
		this.x = x;
		this.y = y;
		this.road = road;
	}
}

public class W√‘π¨Œ Ã‚BFS {
	static int[] dx = { 1, 0, 0, -1 };
	static int[] dy = { 0, -1, 1, 0 };
	static String[] s = { "D", "L", "R", "U" };
	static int R, C;
	static int[][] map;
	static boolean[][] vis;
	static Queue<Site> q = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		R = sc.nextInt();
		map = new int[C + 2][R + 2];
		vis = new boolean[C + 2][R + 2];
		for (int i = 0; i <= R + 1; i++) {
			vis[0][i] = true;
			vis[C + 1][i] = true;
		}
		for (int i = 0; i <= C + 1; i++) {
			vis[i][0] = true;
			vis[i][R + 1] = true;
		}
		for (int i = 1; i <= C; i++) {
			String str = sc.next();
			String[] a = str.split("");
			for (int j = 1; j <= R; j++) {
				map[i][j] = Integer.valueOf(a[j - 1]);
			}
		}
		vis[1][1] = true;
		Site site = new Site(1, 1, "");
		q.offer(site);
		while (!q.isEmpty()) {
			Site item = q.poll();
			if (item.x == C && item.y == R) {
				System.out.println(item.road);
				return;
			}
			for (int i = 0; i < 4; i++) {
				int xx = dx[i] + item.x;
				int yy = dy[i] + item.y;
				String r = item.road + s[i];
				if (!vis[xx][yy] && map[xx][yy] == 0) {
					q.offer(new Site(xx, yy, r));
					vis[xx][yy] = true;
				}
			}
		}
	}
}
