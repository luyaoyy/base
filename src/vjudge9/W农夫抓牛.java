import java.util.*;

public class Wũ��ץţ {
	public static int N, K;// ũ��λ��N��ţ��λ��K
	public static final int MAXN = 100000;// ��������λ��,
	public static boolean vis[] = new boolean[MAXN + 5];// ʹ��Hashset����־ �Ѿ����ʵĵ��λ��
	public static Queue<Node> q = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		Node farmer = new Node(N, 0);
		q.offer(farmer);// ����ʼ����������;
		vis[N] = true;// ���������;
		while (!q.isEmpty()) {// while (������в�Ϊ��)
			Node newNd = q.poll();// ���ʶ����ж���Ԫ��x;ɾ������Ԫ��;
			if (newNd.x == K) {// ���������ж�
				System.out.println(newNd.t);
				return;
			}
//x �������ڵ�
			if (newNd.x - 1 >= 0 && !vis[newNd.x - 1]) { // �õ�δ�����ʹ��ҺϷ�
				q.offer(new Node(newNd.x - 1, newNd.t + 1));// ���õ�������ĩβ;
				vis[newNd.x - 1] = true;// ��־�õ㱻����
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
	int x;// ũ���λ��
	int t;// ũ�����㵽��ǰλ����Ҫ���ѵ�ʱ��

	public Node(int _x, int _t) {
		x = _x;
		t = _t;
	}

}
