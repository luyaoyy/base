import java.util.Scanner;

public class ������� {
	static boolean[][] vis;// visΪ�����ͼ��true��ʾ�ô���X��false��ʾû�� ������dfs�˻ʺ�
	static int n, m;
	static int ans;

	public static void dfs(int x, int y) {
		if (x == n) {// ������һ�֣�������һ
			ans++;
			return;
		}
		if (judge(x, y)) {// �ж��Ƿ�ɷ�
			vis[x][y] = true;// ���Է�,���Ϊtrue
			if (y < m - 1)
				dfs(x, y + 1);
			else
				dfs(x + 1, 0);
			vis[x][y] = false;// ����
		}
		if (y < m - 1)// ���л�û����
			dfs(x, y + 1);
		else// �����Ѿ������ˣ�������һ��
			dfs(x + 1, 0);
	}

	public static boolean judge(int x, int y) {// �ж�(x,y)�Ƿ��ܷ�X
		if (n > 2 && x >= 2) {
			if (vis[x - 2][y] && vis[x - 1][y])// �жϸ���λ��ͬ�е����������Ƿ�Ϊ������2��X�����Ǿͷţ�
				return false;
		}
		if (m > 2 && y >= 2) {
			if (vis[x][y - 2] && vis[x][y - 1])// �жϸ���λ��ͬ�е�ǰ�������Ƿ�Ϊ������2��X�����Ǿͷţ�
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		vis = new boolean[n][m];
		dfs(0, 0);
		System.out.println(ans);
	}
}
