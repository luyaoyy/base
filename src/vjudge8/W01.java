import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class W01 {
	static int[][] map;
	static int[][] color;
	static int colorNum;
	static int roomArea;
	static int maxroomArea;

	static void dfs(int i, int j) {
		if (color[i][j] != 0)
			return;// dfs都要一个return条件，结束递归
		roomArea++;
		color[i][j] = colorNum;
		if ((map[i][j] & 1) == 0)
			dfs(i, j - 1);
		if ((map[i][j] & 2) == 0)
			dfs(i - 1, j);
		if ((map[i][j] & 4) == 0)
			dfs(i, j + 1);
		if ((map[i][j] & 8) == 0)
			dfs(i + 1, j);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.valueOf(br.readLine().trim());
		int C = Integer.valueOf(br.readLine().trim());
		map = new int[R][C];
		color = new int[R][C];
		colorNum = 0;
		maxroomArea = 0;
		for (int i = 0; i < R; i++) {
			String s = br.readLine().trim();
			String[] arr = s.split("\\s+");
			for (int j = 0; j < C; j++)
				map[i][j] = Integer.valueOf(arr[j]);
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (color[i][j] == 0) {
					colorNum++;
					roomArea = 0;
					dfs(i, j);
					maxroomArea = Math.max(maxroomArea, roomArea);
				}
			}
		}
		System.out.println(colorNum);
		System.out.println(maxroomArea);
	}
}