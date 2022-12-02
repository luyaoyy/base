import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class W城堡 {
	public static final int MAX = 60;
	public static int R, C;// 城堡的行和列
	public static int rooms[][] = new int[MAX][MAX];// 存放代表每个方块的整数
	public static int color[][] = new int[MAX][MAX];// 每个房间染的颜色，0表示没有染色
	// 最大房间面积、颜色编号(同号的是同一个房间)、当前正在染色的房间的面积
	public static int maxRoomArea = 0, colorNum = 0, roomArea;

	public static void dfs(int i, int k) {
		// 从方块(i,k)出发进行染色
		if (color[i][k] != 0) {
			return;
		}
		++roomArea;// 走到一个新的未染色方块，当前房间面积要加1
		color[i][k] = colorNum;// 给方块(i,k)染色
		if ((rooms[i][k] & 1) == 0)
			dfs(i, k - 1);// 向左搜
		if ((rooms[i][k] & 2) == 0)
			dfs(i - 1, k);// 向上搜
		if ((rooms[i][k] & 4) == 0)
			dfs(i, k + 1);// 向右搜
		if ((rooms[i][k] & 8) == 0)
			dfs(i + 1, k);// 向下搜
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] split;
		R = sc.nextInt();
		C = sc.nextInt();
		str = sc.nextLine();// 题目描述和样例不一致，兼容两种
		for (int i = 1; i <= R; i++) {
			str = sc.nextLine().trim();// 将行末空格去掉
			split = str.split("\\s+");// 用一个或多个空格隔开的数据
			for (int k = 1; k <= C; ++k) {
				rooms[i][k] = Integer.parseInt(split[k - 1]);
			}
		}
		for (int i = 1; i <= R; i++) {
			// 寻找一个未染色的方块作为新房间起点开始染色
			for (int k = 1; k <= C; k++) {
				// 找到一个新的起点，代表找到一个新房间
				if (color[i][k] == 0) {
					++colorNum;// 换一个颜色编号
					roomArea = 0;
					dfs(i, k);
					maxRoomArea = Math.max(maxRoomArea, roomArea);
				}
			}
		}
		System.out.println(colorNum);// 颜色编号种数就是房间个数
		System.out.println(maxRoomArea);
	}
}
