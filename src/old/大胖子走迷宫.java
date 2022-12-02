import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 大胖子走迷宫 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		// 上下左右四个方向走
		int[] r = new int[] { 2, 1, 0 }; // 胖的半径 分别表示占5*5 3*3 1*1空间
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[][] map = new char[n][n]; 
		boolean[][] vis = new boolean[n][n]; // 标识是否走过这个点
		for (int i = 0; i < n; i++)
			map[i] = sc.next().toCharArray();
		Queue<int[]> q = new LinkedList<int[]>(); 
		q.offer(new int[] { 2, 2, 0 }); // 起点坐标2，2，和0 时刻
		vis[2][2] = true; // 标识起点走过
		while (!q.isEmpty()) { 
			int x = q.peek()[0], y = q.peek()[1], t = q.poll()[2]; // 取最前面的一个坐标和时刻
			if (x == n - 3 && y == n - 3) { // 到达出口，输出
				System.out.println(t);
				return;
			}
			if (t / k < 2)
				q.offer(new int[] { x, y, t + 1 }); // 当前可以在原地，让时刻加 1 ，如果下面的路他不能走，那将还是先走 //当前这个点，但是他可能已经缩小了
			for (int i = 0; i < 4; i++) {
				int xx = x + dx[i], yy = y + dy[i]; // 记录新坐标
				int radius = (t / k) > 2 ? 0 : r[t / k]; // 判断半径
				if (xx - radius < 0 || xx + radius >= n || yy - radius < 0 || yy + radius >= n || vis[xx][yy]) // 边界判断+是否走过这个点判断
					continue;
				boolean flag = false; 
				for (int j = xx - radius; j <= xx + radius; j++)// 判断走到(xx,yy)点处的所占空间是否有障碍物
					for (int m = yy - radius; m <= yy + radius; m++)
						if (map[j][m] == '*') 
						{
							flag = true;//表示有障碍物
							break;
						}
				if (flag)
					continue; // 如果有障碍物，那不能走，换下个点
				q.offer(new int[] { xx, yy, t + 1 }); // 这个点能走，坐标加进去，后面可以由他扩展，时刻+1；
				vis[xx][yy] = true; // 标识这个点已经走过
			}
		}

	}
}
