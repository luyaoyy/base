
public class ������� {
	static boolean[] vis;
	static int[] prim;
	static long ans;

	public static void main(String[] args) {
		prim = new int[2020];
		vis = new boolean[2020];
		for (int i = 2; i <= 2019; i++) {//�ȴ�������
			if (!vis[i]) {
				for (int j = 2 * i; j <= 2019; j += i) {
					vis[j] = true;
				}
			}
		}
		int id = 0;// prim[id]��ʾ��id��������ֵ���±��1��ʼ����0
		for (int i = 2; i <= 2019; i++) {
			if (!vis[i])
				prim[++id] = i;
		}
		long dp[][] = new long[id + 1][2020];// dp[i][j]��ʾǰi��������ɺ�Ϊj�Ĳ�ͬ�����
		dp[0][0] = 1;//��ʼ�� ��Ҫ����
		for (int i = 1; i <= id; i++) {// ���Ʊ������� ��prim��ѡȡ����������ʹ���Ϊ2019����ѡȡ��������
			for (int j = 0; j <= 2019; j++) {
				if (j >= prim[i])
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - prim[i]];
				else
					dp[i][j] = dp[i - 1][j];
			}
		}
		System.out.println(dp[id][2019]);
	}
}
