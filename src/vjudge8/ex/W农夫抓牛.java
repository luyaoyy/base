import java.util.*;

public class W农夫抓牛 {
	public static int N, K;// 农夫位置N，牛的位置K
	public static final int MAXN = 100000;// 数轴的最大位置,
	public static boolean vis[] = new boolean[MAXN + 5];// 使用Hashset来标志 已经访问的点的位置
	public static Queue<Node> q = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		Node farmer = new Node(N, 0);
		q.offer(farmer);// 将起始点放入队列中;
		vis[N] = true;// 标记起点访问;
		while (!q.isEmpty()) {// while (如果队列不为空)
			Node newNd = q.poll();// 访问队列中队首元素x;删除队首元素;
			if (newNd.x == K) {// 加上条件判断
				System.out.println(newNd.t);
				return;
			}
//x 所有相邻点
			if (newNd.x - 1 >= 0 && !vis[newNd.x - 1]) { // 该点未被访问过且合法
				q.offer(new Node(newNd.x - 1, newNd.t + 1));// 将该点加入队列末尾;
				vis[newNd.x - 1] = true;// 标志该点被访问
			}
			if (newNd.x + 1 <= MAXN && !vis[newNd.x + 1]) {
				q.offer(new Node(newNd.x + 1, newNd.t + 1));
				vis[newNd.x + 1] = true;
			}
			if (newNd.x * 2 <= MAXN && !vis[newNd.x * 2]) {
				q.offer(new Node(newNd.x * 2, newNd.t + 1));
				vis[newNd.x * 2] = true;
			}
		}
	}
}

class Node {
	int x;// 农夫的位置
	int t;// 农夫从起点到当前位置需要花费的时间

	public Node(int _x, int _t) {
		x = _x;
		t = _t;
	}

}
