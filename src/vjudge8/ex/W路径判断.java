import java.util.Scanner;

//题目链接:https://blog.csdn.net/weixin_45735242/article/details/106878853
public class W路径判断 {
	public static int arr[][];// 邻接矩阵
	public static boolean vis[];// 访问控制，false表示未访问，true表示已经访问
	public static int N;// 结点个数
	public static int E;// 边的数量
	public static int a, b, start, end;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 读入数据
		// 读入N E sc.nextLine();
		String str = sc.nextLine();
		String[] split = str.split(" ");
		// 获得 N E Integer.parseInt()
		N = Integer.parseInt(split[0]);
		E = Integer.valueOf(split[1]);
		// new 出 arr 和vis数组
		arr = new int[N][N];
		vis = new boolean[N];
		// 读入E条边的起点和终点
		for (int i = 0; i < E; i++) {
			str = sc.nextLine();
			split = str.split(" ");
			// a = 和 获得 N E
			// b= 和 获得 N E
			a = Integer.parseInt(split[0]);
			b = Integer.valueOf(split[1]);
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		str = sc.nextLine();
		split = str.split(" ");
		// start = 和 获得 N E
		// end= 和 获得 N E
		start = Integer.parseInt(split[0]);
		end = Integer.valueOf(split[1]);
		boolean flag = dfs(start, end);
		if (flag) {
			// "There is a path between i and j."
			System.out.printf("There is a path between %d and %d.\n", start, end);
		} else {
			// "There is no path between i and j."
			System.out.printf("There is no path between %d and %d.\n", start, end);
		}
	}

	// 返回值为false，则失败，返回值为true，则成功。
	public static boolean dfs(int start2, int end2) {
		// TODO Auto-generated method stub
		// 判断 start2==end2 return true
		if (start2 == end2)
			return true;
		// 设置标志位，设置start2点为已访问
		vis[start2] = true;
		// 从start2开始，搜索所有与之相连，且未被访问的点，以该点为起点进行新的搜索
		for (int k = 0; k < N; k++) {
			if (arr[start2][k] == 1 && !vis[k]) {
				if (dfs(k, end2)) {
					return true;
				}
			}
		}
		return false;
	}
}
