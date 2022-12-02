import java.util.*;

public class W棋盘 {
	public static char a[][] = new char[10][10];// 存放棋盘
	public static boolean vis[] = new boolean[10];// 各列是否放置了棋子
	public static int n, k, sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			String[] split = str.split("\\s+");
			n = Integer.parseInt(split[0]);
			k = Integer.parseInt(split[1]);
			if (n == -1 && k == -1)
				break;
			for (int i = 0; i < n; i++) {
				str = sc.nextLine();
				for (int j = 0; j < n; j++) {
					a[i][j] = str.charAt(j);
				}
			}
			for (int i = 0; i < 10; i++) {
				vis[i] = false;
			}
			sum = 0;
			dfs(0, 0);
			System.out.println(sum);
		}
	}

	private static void dfs(int x, int y) {// x表示放置的行，y表示已摆放的棋子
// TODO Auto-generated method stub
		if (y >= k) {// 棋子摆放完毕，方案数++，返回
			sum++;
			return;
		}
		for (int i = x; i < n; i++) {// 从第i行开始放子
			for (int j = 0; j < n; j++) {// 判断第j列是否可以放子
				if (!vis[j] && a[i][j] == '#') {
					vis[j] = true;// 在这一列放子
					dfs(i + 1, y + 1);
					vis[j] = false;
				}
			}
		}
	}

}
