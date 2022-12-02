
public class 平方拆分 {
	public static int sum = 0,max = 45;
	public static void main(String[] args) {
		dfs(2019,1);
		System.out.println(sum);
	}
	public static void  dfs(int num, int min) {
		if (num < 0) {
			return;
		}
		if (num == 0) {
			sum ++;
			return;
		}
		for (int i = min; i < max; i++) {
			dfs(num - i * i, i + 1);
		}//用2019减去平方数，从一开始，深搜，结果刚好为0，就是一种方法
	}

}
