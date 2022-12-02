import java.util.Scanner;

public class 递增序列 {
	static int[] dx = { 0, -1, 1, 1, 1 };// 右 右上 右下 下 左下，题目要求从左往右或者从上往下，所以把从右往左
	                                     //和从下往上的3个方向剔除
	static int[] dy = { 1, 1, 1, 0, -1 };
	static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		char[][] c = new char[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++)
				c[i][j] = s.charAt(j);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < 5; k++) {
					int x = i, y = j;
					while (true) {//以c[i][j]为起点，对5个方向的每个字符进行搜索比较
						x += dx[k];
						y += dy[k];
						if (x < 0 || x >= n || y < 0 || y >= m)//到达边界或越界，则该方向搜索结束
							break;
						if (c[i][j] < c[x][y])
							ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
