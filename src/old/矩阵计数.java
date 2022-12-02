import java.util.Scanner;

public class 矩阵计数 {
	static boolean[][] vis;// vis为矩阵地图，true表示该处放X，false表示没放 类似于dfs八皇后
	static int n, m;
	static int ans;

	public static void dfs(int x, int y) {
		if (x == n) {// 放完了一轮，方法加一
			ans++;
			return;
		}
		if (judge(x, y)) {// 判断是否可放
			vis[x][y] = true;// 可以放,标记为true
			if (y < m - 1)
				dfs(x, y + 1);
			else
				dfs(x + 1, 0);
			vis[x][y] = false;// 回溯
		}
		if (y < m - 1)// 该行还没放完
			dfs(x, y + 1);
		else// 该行已经放完了，进行下一行
			dfs(x + 1, 0);
	}

	public static boolean judge(int x, int y) {// 判断(x,y)是否能放X
		if (n > 2 && x >= 2) {
			if (vis[x - 2][y] && vis[x - 1][y])// 判断该行位置同列的上面两个是否为连续的2个X，不是就放，
				return false;
		}
		if (m > 2 && y >= 2) {
			if (vis[x][y - 2] && vis[x][y - 1])// 判断该列位置同行的前面两个是否为连续的2个X，不是就放，
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		vis = new boolean[n][m];
		dfs(0, 0);
		System.out.println(ans);
	}
}
