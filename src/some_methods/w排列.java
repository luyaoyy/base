package wһЩ����;

public class w���� {
	// ʹ���������飬һ������洢�����е�����
	public static int arr[];
	// ���ʿ�������
	public static boolean vis[];
	public static int N,a;
	public static void dfs(int step) {
		/*
		 * �ж��Ƿ��Ѿ����꣬����Ѿ����꣬����� ���� ÿ�ζ��ӵ�һ������ʼ�����ж� ��������Ѿ����ʣ�������һ�� ���û�з��ʣ��򽫸�������
		 * �źú󣬵ݹ����dfs������һ�� �ع�
		 */
		if (step == N) {
			System.out.print(arr[0]);
			for (int i = 1; i < N; i++) {
				System.out.print(" " + arr[i]);
			}
			a++;
			System.out.println();
		} else {
			for (int i = 1; i <= N; i++) {
				if (!vis[i - 1]) {
					arr[step] = i;
					vis[i - 1] = true;
					dfs(step + 1);
					vis[i - 1] = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		N = 9;
		arr = new int[N];
		vis = new boolean[N];
		dfs(0);
		System.out.println(a);
	}

}
