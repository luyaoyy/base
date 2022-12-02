import java.util.*;

public class W���� {
	public static char a[][] = new char[10][10];// �������
	public static boolean vis[] = new boolean[10];// �����Ƿ����������
	public static int n, k, sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			String[] split = str.split("\\s+");
			n = Integer.parseInt(split[0]);
			k = Integer.parseInt(split[1]);
			if (n == -1 && k == -1)
				break;
			for (int i = 0; i < n; i++) {
				str = sc.nextLine();
				for (int j = 0; j < n; j++) {
					a[i][j] = str.charAt(j);
				}
			}
			for (int i = 0; i < 10; i++) {
				vis[i] = false;
			}
			sum = 0;
			dfs(0, 0);
			System.out.println(sum);
		}
	}

	private static void dfs(int x, int y) {// x��ʾ���õ��У�y��ʾ�Ѱڷŵ�����
// TODO Auto-generated method stub
		if (y >= k) {// ���Ӱڷ���ϣ�������++������
			sum++;
			return;
		}
		for (int i = x; i < n; i++) {// �ӵ�i�п�ʼ����
			for (int j = 0; j < n; j++) {// �жϵ�j���Ƿ���Է���
				if (!vis[j] && a[i][j] == '#') {
					vis[j] = true;// ����һ�з���
					dfs(i + 1, y + 1);
					vis[j] = false;
				}
			}
		}
	}

}
