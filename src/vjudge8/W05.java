import java.util.Scanner;

public class W05 {
	static boolean[][] flag;
	static int ans, n;
	static int[] dx = { -1, 0, 0 };
	static int[] dy = { 0, -1, 1 };

	public static void dfs(int x, int y, int n) {
		if (n == 0) {
			ans += 1;
			return;
		} else {
			for (int i = 0; i < 3; i++) {
				int xx = dx[i] + x;
				int yy = dy[i] + y;
				if (!flag[xx][yy]) {
					flag[xx][yy] = true;
					dfs(xx, yy, n - 1);
					flag[xx][yy] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		flag = new boolean[41][41];
		flag[21][21]=true;//这步很重要，标记起点
		dfs(21, 21, n);
		System.out.println(ans);
	}
}
