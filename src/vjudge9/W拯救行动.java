import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x, y, time;

	public Point(int x, int y, int time) {
		this.x = x;
		this.y = y;
		this.time = time;
	}
}

public class W拯救行动 {
	static int N;
	static int M;
	static char[][] map;
	static boolean[][] vis;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static Point start;
	static Point goal;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		while (S != 0) {
			N = sc.nextInt();
			M = sc.nextInt();
			vis = new boolean[N + 2][M + 2];
			map = new char[N + 2][M + 2];
			for (int i = 0; i <= M + 1; i++) {
				vis[0][i] = true;
				vis[N + 1][i] = true;
				map[0][i] = '#';
				map[N + 1][i] = '#';
			}
			for (int i = 0; i <= N + 1; i++) {
				vis[i][0] = true;
				vis[i][M + 1] = true;
				map[i][0] = '#';
				map[i][M + 1] = '#';
			}
			for (int i = 1; i <= N; i++) {
				String s = sc.next();
				for (int j = 1; j <= M; j++) {
					map[i][j] = s.charAt(j - 1);
					if (s.charAt(j - 1) == 'r')
						start = new Point(i, j, 0);
					if (s.charAt(j - 1) == 'a')
						goal = new Point(i, j, -1);
				}
			}
			Queue<Point> q = new LinkedList<>();
			vis[start.x][start.y] = true;
			q.offer(start);
			while (!q.isEmpty()) {
				Point item = q.peek();
				if (item.x == goal.x && item.y == goal.y) {
					break;
				}
				q.poll();
				if (map[item.x][item.y] == 'x') {
					map[item.x][item.y] = '@';
					q.offer(new Point(item.x, item.y, item.time + 1));//这步不能放在上下左右里面，要保证时间最短，避免遇见守卫
				} else {
					for (int i = 0; i < 4; i++) {
						int xx = item.x + dx[i];
						int yy = item.y + dy[i];
						if (map[xx][yy] == '#')
							continue;
						if (!vis[xx][yy]) {
							q.offer(new Point(xx, yy, item.time + 1));
							vis[xx][yy]=true;
						}
					}
				}
			}
			if (q.isEmpty())
				System.out.println("Impossible");
			else
				System.out.println(q.peek().time);
			S--;
		}
	}
}
