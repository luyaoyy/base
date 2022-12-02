import java.util.Scanner;

public class ³Ë»ý×î´ódfs {
	static int len, K;
	static long max;
	static String num;
	static boolean vis[];
	static int[] place;

	public static void dfs(int k) {
		if (k == K) {
			long a = 1;
			a *= Long.valueOf(num.substring(0, place[0] + 1));
			for (int i = 0; i < K - 1; i++)
				a *= Long.valueOf(num.substring(place[i] + 1, place[i + 1] + 1));
			a *= Long.valueOf(num.substring(place[K - 1] + 1, len));
			for(int i:place)
				System.out.print(i);
			System.out.println();
			max = Math.max(a, max);
			return;
		}
		for (int i = place[k - 1 < 0 ? 0 : k - 1]; i <= len - 2; i++) {
			if (!vis[i]) {
				vis[i] = true;
				place[k] = i;
				dfs(k + 1);
				vis[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		K = sc.nextInt();
		num = sc.next();
		vis = new boolean[len - 1];
		place = new int[K];
		dfs(0);
		System.out.println(max);
	}
}
