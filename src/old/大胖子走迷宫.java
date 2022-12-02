import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ���������Թ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		// ���������ĸ�������
		int[] r = new int[] { 2, 1, 0 }; // �ֵİ뾶 �ֱ��ʾռ5*5 3*3 1*1�ռ�
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[][] map = new char[n][n]; 
		boolean[][] vis = new boolean[n][n]; // ��ʶ�Ƿ��߹������
		for (int i = 0; i < n; i++)
			map[i] = sc.next().toCharArray();
		Queue<int[]> q = new LinkedList<int[]>(); 
		q.offer(new int[] { 2, 2, 0 }); // �������2��2����0 ʱ��
		vis[2][2] = true; // ��ʶ����߹�
		while (!q.isEmpty()) { 
			int x = q.peek()[0], y = q.peek()[1], t = q.poll()[2]; // ȡ��ǰ���һ�������ʱ��
			if (x == n - 3 && y == n - 3) { // ������ڣ����
				System.out.println(t);
				return;
			}
			if (t / k < 2)
				q.offer(new int[] { x, y, t + 1 }); // ��ǰ������ԭ�أ���ʱ�̼� 1 ����������·�������ߣ��ǽ��������� //��ǰ����㣬�����������Ѿ���С��
			for (int i = 0; i < 4; i++) {
				int xx = x + dx[i], yy = y + dy[i]; // ��¼������
				int radius = (t / k) > 2 ? 0 : r[t / k]; // �жϰ뾶
				if (xx - radius < 0 || xx + radius >= n || yy - radius < 0 || yy + radius >= n || vis[xx][yy]) // �߽��ж�+�Ƿ��߹�������ж�
					continue;
				boolean flag = false; 
				for (int j = xx - radius; j <= xx + radius; j++)// �ж��ߵ�(xx,yy)�㴦����ռ�ռ��Ƿ����ϰ���
					for (int m = yy - radius; m <= yy + radius; m++)
						if (map[j][m] == '*') 
						{
							flag = true;//��ʾ���ϰ���
							break;
						}
				if (flag)
					continue; // ������ϰ���ǲ����ߣ����¸���
				q.offer(new int[] { xx, yy, t + 1 }); // ��������ߣ�����ӽ�ȥ���������������չ��ʱ��+1��
				vis[xx][yy] = true; // ��ʶ������Ѿ��߹�
			}
		}

	}
}
