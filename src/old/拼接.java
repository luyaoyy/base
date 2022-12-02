
public class ƴ�� {
	static boolean[][] vis;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int ans;

	public static void dfs(int x, int y) {
		if (x == 0 || y == 7) {//�ܵ��߽� �ָ����1
			ans++;
			return;
		}
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i], yy = y + dy[i];
			if (xx < 0 || xx > 7 || yy < 0 || yy > 7)//Խ�紦��
				continue;
			if (vis[xx][yy] || xx == yy)//�Ѿ����ʹ��Ĳ��ٷ���
				continue;
			vis[xx][yy] = true;
			dfs(xx, yy);
			vis[xx][yy] = false;
		}
	}

	public static void main(String[] args) {
		vis = new boolean[8][8];
		for (int i = 0; i < 8; i++) {// �����������Ͻǵ����½ǶԽ��߳��� �ж��Ƿ��ܵ��߽�
			vis[i][i] = true;
			dfs(i, i);
		}
		System.out.println(ans);
	}
}
