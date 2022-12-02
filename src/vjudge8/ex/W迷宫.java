import java.util.ArrayList;
import java.util.Scanner;

public class W√‘π¨ {
	static int[][] map;
	static boolean[][] vis;
	static ArrayList<String> ans;

	public static void dfs(int x, int y, String road) {
		if (x == 4 && y == 6) {
			ans.add(road);
			return;
		}

		if (!vis[x - 1][y] && map[x - 1][y] == 0) {
			vis[x - 1][y] = true;
			dfs(x - 1, y, road + "U");
			vis[x - 1][y] = false;
		}
		if (!vis[x + 1][y] && map[x + 1][y] == 0) {
			vis[x + 1][y] = true;
			dfs(x + 1, y, road + "D");
			vis[x + 1][y] = false;
		}
		if (!vis[x][y - 1] && map[x][y - 1] == 0) {
			vis[x][y - 1] = true;
			dfs(x, y - 1, road + "L");
			vis[x][y - 1] = false;
		}
		if (!vis[x][y + 1] && map[x][y + 1] == 0) {
			vis[x][y + 1] = true;
			dfs(x, y + 1, road + "R");
			vis[x][y + 1] = false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[6][8];
		vis = new boolean[6][8];
		ans = new ArrayList<String>();
		for (int i = 0; i <= 5; i++) {
			map[i][0] = 1;
			map[i][7] = 1;
		}
		for (int i = 0; i <= 7; i++) {
			map[0][i] = 1;
			map[5][i] = 1;
		}
		for (int i = 1; i <= 4; i++) {
			String s = sc.next();
			String[] arr = s.split("");
			for (int j = 1; j <= 6; j++) {
				map[i][j] = Integer.valueOf(arr[j ]);
			}
		}
		vis[1][1] = true;
		String road = "";
		dfs(1, 1, road);
		int min=ans.get(0).length(),id=0;
		for(int i=0;i<ans.size();i++) {
			if(ans.get(i).length()<min) {
				id=i;
				min=ans.get(i).length();
			}
		}
		System.out.println(ans.get(id));
	}
}
