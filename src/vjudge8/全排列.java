import java.util.Scanner;

public class 全排列 {
	static int n;
	static int[] arr;
	static boolean[] flag;

	static void dfs(int step) {
		if (step == n + 1) {
			String s = "";
			for (int i = 1; i <= n; i++)
				s += arr[i] + " ";
			System.out.println(s.trim());
			return;
		} else {
			for (int i = 1; i <= n; i++) {
				if (!flag[i]) {
					flag[i] = true;
					arr[step] = i;
					dfs(step + 1);
					flag[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();// 不能int n=sc.nextInt(); 已经定义过了
		arr = new int[n + 1];
		flag = new boolean[n + 1];
		dfs(1);// 参数step是arr元素的下标，这里定义下标从1开始
	}
}
