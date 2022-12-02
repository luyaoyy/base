package w一些方法;

public class w排列 {
	// 使用两个数组，一个数组存储待排列的数据
	public static int arr[];
	// 访问控制数组
	public static boolean vis[];
	public static int N,a;
	public static void dfs(int step) {
		/*
		 * 判断是否已经排完，如果已经排完，则输出 否则 每次都从第一个数开始进行判断 如果该数已经访问，则排下一个 如果没有访问，则将该数排入
		 * 排好后，递归调用dfs安排下一个 回滚
		 */
		if (step == N) {
			System.out.print(arr[0]);
			for (int i = 1; i < N; i++) {
				System.out.print(" " + arr[i]);
			}
			a++;
			System.out.println();
		} else {
			for (int i = 1; i <= N; i++) {
				if (!vis[i - 1]) {
					arr[step] = i;
					vis[i - 1] = true;
					dfs(step + 1);
					vis[i - 1] = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		N = 9;
		arr = new int[N];
		vis = new boolean[N];
		dfs(0);
		System.out.println(a);
	}

}
