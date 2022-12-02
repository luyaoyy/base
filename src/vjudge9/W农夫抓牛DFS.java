import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WÅ©·ò×¥Å£DFS {
	static int N;
	static int K;
	static boolean[] vis;
	static ArrayList<Integer> ans;

	public static void dfs(int x, int t) {
		if (x == K) {
			ans.add(t);
			return;
		}
		
		if ( x - 1 >= 0&&!vis[x - 1] ) {
			vis[x - 1] = true;
			dfs(x - 1, t + 1);
			vis[x - 1] = false;
		}
		if (!vis[x + 1] && x + 1<=100000) {
			vis[x + 1] = true;
			dfs(x + 1, t + 1);
			vis[x + 1] = false;
		}
		if (!vis[2 * x] && 2 * x <= 100000) {
			vis[2 * x] = true;
			dfs(2 * x, t + 1);
			vis[2 * x] = false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		vis=new boolean[100000];
		vis[N]=true;
		ans=new ArrayList<Integer>();
		dfs(N, 0);
		System.out.println(Collections.min(ans));
	}
}
