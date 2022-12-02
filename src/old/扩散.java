import java.util.LinkedList;
import java.util.Queue;

class Point {
	int x, y, t;

	public Point(int x, int y, int t) {
		this.x = x;
		this.y = y;
		this.t = t;
	}
}

public class ��ɢ {
	static boolean[][] vis;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int ans = 4;

	public static void main(String[] args) {
		vis = new boolean[8000][8000];//�ռ������޴�ģ���֤��ɢ���̲���Խ��
		vis[2500][2500] = true;//������
		vis[4070][2511] = true;
		vis[2511][2514] = true;
		vis[4500][4500] = true;
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(2500, 2500, 0));//3�����ͬʱ��ɢ
		q.offer(new Point(4520, 2511, 0));
		q.offer(new Point(2511, 2514, 0));
		q.offer(new Point(4500, 4500, 0));
		while (!q.isEmpty()) {
			Point i = q.poll();
			if (i.t == 2020) {
				System.out.println(ans);
				return;
			}
			int x = i.x, y = i.y;
			for (int j = 0; j < 4; j++) {
				int xx = x + dx[j], yy = y + dy[j];
				if (!vis[xx][yy]) {
					ans++;
					vis[xx][yy] = true;//�Ѿ���ɢ���ı��Ϊtrue
					q.offer(new Point(xx, yy, i.t + 1));
				}
			}
		}
	}
}
