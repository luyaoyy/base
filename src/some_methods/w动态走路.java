package w一些方法;

import java.util.Scanner;

public class w动态走路 {
	// 下面是需要几步到终点
//	public static int dp(int m, int n) {
//		if (m <= 0 || n <= 0) {
//	        return 0;
//	    }
//	    int[][] dp = new int[m][n]; // 
//	      // 初始化
//	      for(int i = 0; i < m; i++){
//	      dp[i][0] = 1;
//	    }
//	      for(int i = 0; i < n; i++){
//	      dp[0][i] = 1;
//	    }
//	    for (int i = 1; i < m; i++) {
//	        for (int j = 1; j < n; j++) {
//	            dp[i][j] = dp[i-1][j] + dp[i][j-1];
//	        }
//	    }
//	    return dp[m-1][n-1];
//	}
//
//	public static void main(String[] args) {
//		System.out.println(dp(51, 9));
//	}
	// 下面是到一个二维数组到终点路径和最小
//	public static int cal(int x, int y, int[][] a) {
//		if (x == 0 && y == 0)
//			return a[0][0];
//		if (x == 0)
//			return a[0][y] + cal(0, y - 1, a);
//		else if (y == 0) {
//			return a[x][0] + cal(x - 1, 0, a);
//		} else
//			return Math.min(cal(x - 1, y, a), cal(x, y - 1, a)) + a[x][y];
//	}
//
//	public static void main(String[] args) {
//		int[][] a = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
//		System.out.println(cal(2, 1, a));
//	}
	// 下面是字符串变换最少步骤
	public static int cal(int x, int y, String s1, String s2) {
		if (x == 0)
			return y;
		if (y == 0)
			return x;
		if (s1.charAt(x) == s2.charAt(y))
			return cal(x - 1, y - 1, s1, s2);
		else
			return Math.min(Math.min(cal(x-1, y - 1, s1, s2), cal(x - 1, y, s1, s2)), cal(x, y - 1, s1, s2)) + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next();
		System.out.println(cal(s1.length() - 1, s2.length() - 1, s1, s2));
	}
}
