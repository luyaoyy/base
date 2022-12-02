import java.util.Scanner;

//��Ŀ����:https://blog.csdn.net/weixin_45735242/article/details/106878853
public class W·���ж� {
	public static int arr[][];// �ڽӾ���
	public static boolean vis[];// ���ʿ��ƣ�false��ʾδ���ʣ�true��ʾ�Ѿ�����
	public static int N;// ������
	public static int E;// �ߵ�����
	public static int a, b, start, end;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��������
		// ����N E sc.nextLine();
		String str = sc.nextLine();
		String[] split = str.split(" ");
		// ��� N E Integer.parseInt()
		N = Integer.parseInt(split[0]);
		E = Integer.valueOf(split[1]);
		// new �� arr ��vis����
		arr = new int[N][N];
		vis = new boolean[N];
		// ����E���ߵ������յ�
		for (int i = 0; i < E; i++) {
			str = sc.nextLine();
			split = str.split(" ");
			// a = �� ��� N E
			// b= �� ��� N E
			a = Integer.parseInt(split[0]);
			b = Integer.valueOf(split[1]);
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		str = sc.nextLine();
		split = str.split(" ");
		// start = �� ��� N E
		// end= �� ��� N E
		start = Integer.parseInt(split[0]);
		end = Integer.valueOf(split[1]);
		boolean flag = dfs(start, end);
		if (flag) {
			// "There is a path between i and j."
			System.out.printf("There is a path between %d and %d.\n", start, end);
		} else {
			// "There is no path between i and j."
			System.out.printf("There is no path between %d and %d.\n", start, end);
		}
	}

	// ����ֵΪfalse����ʧ�ܣ�����ֵΪtrue����ɹ���
	public static boolean dfs(int start2, int end2) {
		// TODO Auto-generated method stub
		// �ж� start2==end2 return true
		if (start2 == end2)
			return true;
		// ���ñ�־λ������start2��Ϊ�ѷ���
		vis[start2] = true;
		// ��start2��ʼ������������֮��������δ�����ʵĵ㣬�Ըõ�Ϊ�������µ�����
		for (int k = 0; k < N; k++) {
			if (arr[start2][k] == 1 && !vis[k]) {
				if (dfs(k, end2)) {
					return true;
				}
			}
		}
		return false;
	}
}
