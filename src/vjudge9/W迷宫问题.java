import java.util.ArrayList;
import java.util.Scanner;

class Ro {
	int x;
	int y;

	public Ro(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

public class W迷宫问题 {
	static int[][] map;
	static boolean[][] vis;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static ArrayList<ArrayList<Ro>> list;

	@SuppressWarnings("unchecked")
	public static void dfs(int x, int y, ArrayList<Ro> total) {
		if (x == 5 && y == 5) {

			list.add(total);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (!vis[xx][yy] && map[xx][yy] == 0) {
				vis[xx][yy] = true;
				ArrayList<Ro> to = new ArrayList<>();
				to = (ArrayList<Ro>) total.clone();//这里注意 不能直接total.add(new Ro(xx,yy) 会污染其他递归的数据
				to.add(new Ro(xx, yy));
				dfs(xx, yy, to);
				vis[xx][yy] = false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[7][7];
		vis = new boolean[7][7];
		list = new ArrayList<ArrayList<Ro>>();
		for (int i = 0; i <= 6; i++) {
			map[0][i] = 1;
			map[6][i] = 1;
			map[i][0] = 1;
			map[i][6] = 1;
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		vis[1][1] = true;
		ArrayList<Ro> total = new ArrayList<>();
		total.add(new Ro(1, 1));
		dfs(1, 1, total);
		int min = list.get(0).size(), id = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).size() < min) {
				id = i;
				min = list.get(i).size();
			}
		}
		for (int j = 0; j < list.get(id).size(); j++) {
			System.out.println("(" + (list.get(id).get(j).x - 1) + ", " + (list.get(id).get(j).y - 1) + ")");
		}
	}
}

