import java.util.Scanner;

public class �������� {
	static int[] dx = { 0, -1, 1, 1, 1 };// �� ���� ���� �� ���£���ĿҪ��������һ��ߴ������£����԰Ѵ�������
	                                     //�ʹ������ϵ�3�������޳�
	static int[] dy = { 1, 1, 1, 0, -1 };
	static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		char[][] c = new char[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++)
				c[i][j] = s.charAt(j);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < 5; k++) {
					int x = i, y = j;
					while (true) {//��c[i][j]Ϊ��㣬��5�������ÿ���ַ����������Ƚ�
						x += dx[k];
						y += dy[k];
						if (x < 0 || x >= n || y < 0 || y >= m)//����߽��Խ�磬��÷�����������
							break;
						if (c[i][j] < c[x][y])
							ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
