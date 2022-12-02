import java.util.Scanner;

public class ȫ���� {
	static int n;
	static int[] arr;
	static boolean[] flag;

	static void dfs(int step) {
		if (step == n + 1) {
			String s = "";
			for (int i = 1; i <= n; i++)
				s += arr[i] + " ";
			System.out.println(s.trim());
			return;
		} else {
			for (int i = 1; i <= n; i++) {
				if (!flag[i]) {
					flag[i] = true;
					arr[step] = i;
					dfs(step + 1);
					flag[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();// ����int n=sc.nextInt(); �Ѿ��������
		arr = new int[n + 1];
		flag = new boolean[n + 1];
		dfs(1);// ����step��arrԪ�ص��±꣬���ﶨ���±��1��ʼ
	}
}
