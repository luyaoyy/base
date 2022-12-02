import java.util.Scanner;

public class ������ {
	static int mod = 123456;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[][] dp = new int[1000][1000];        // dp[i][j]��ʾ��ǰi������j���۵�ķ�����
		dp[1][0] = 1;
		for (int i = 2; i <= n; i++) {         // ÿ��һ�����۵�ֻ������0������1������2�� (���ɡ�����)
			dp[i][0] = 2;//���۵�ֻ��˳����ߵ��� ��2�ַ���
			for (int j = 0; j <= i - 2; j++) {
				dp[i + 1][j] = (dp[i + 1][j] + dp[i][j] * (j + 1)) % mod;          // �۵㲻����
				dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j] * 2) % mod;         // �۵�����һ��
				dp[i + 1][j + 2] = (dp[i + 1][j + 2] + dp[i][j] * (i - j - 2)) % mod;// �۵���������
			}
		}
		System.out.println(dp[n][k - 1]);
	}
}
