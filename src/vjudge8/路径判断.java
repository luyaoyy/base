import java.util.Scanner;

public class 路径判断 {//给定一个图 和图中两点，判断两点是否连通
	static int[][] map;
	static boolean[] vis;
	static int n, e;
	static int begin, end;

	public static void dfs(int a) {
		for (int i = 0; i < n; i++) {
			if (map[a][i] == 1 && !vis[i]) {
				vis[i] = true;
				dfs(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		e = sc.nextInt();
		map = new int[n][n];
		vis=new boolean[n];
		for (int i = 0; i < n; i++)
			map[i][i] = 1;
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}
		begin = sc.nextInt();
		end = sc.nextInt();
		vis[begin] = true;
		dfs(begin);
		if (vis[end])
			System.out.println("There is a path between " + begin + " and " + end + ".");
		else
			System.out.println("There is no path between " + begin + " and " + end + ".");
	}
}
