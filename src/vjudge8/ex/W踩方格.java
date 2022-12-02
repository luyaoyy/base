import java.util.Scanner;

public class W踩方格 {
	public static boolean vis[][] = new boolean[25][50];//

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = dfs(21, 25, n);
		System.out.println(ans);
	}

	private static int dfs(int row, int column, int n) {
		if (n == 0)
			return 1;
		vis[row][column] = true;
		int ans = 0 ;
//北、东、西三个方向
		if (!vis[row - 1][column])
			ans += dfs(row - 1, column, n - 1);// North

		if (!vis[row][column + 1])
			ans += dfs(row, column + 1, n - 1);// East

		if (!vis[row][column - 1])
			ans += dfs(row, column - 1, n - 1);// West

		vis[row][column] = false;// 多条路径到达某一个点，需要回溯
		return ans;
	}

}
