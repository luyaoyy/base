import java.util.Scanner;

public class ���Ű��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next();
		int l1 = s1.length(), l2 = s2.length();// �ַ��޸Ĳ������� �� ɾ �� ��Ŀֻ�����޸� s1���ַ�
		int[][] dp = new int[l1 + 1][l2 + 1]; // dp[i][j]��ʾs1ǰi���ַ����а���s2ǰj���ַ���
		for (int i = 0; i <= l2; i++) {
			for (int j = 0; j <= l2; j++)
				dp[i][j] = 999999999;// �����ó������
		}
		dp[0][0] = 0;
		for (int i = 1; i <= l1; i++) {
			dp[i][0] = 0;//s1�����Ͱ���s2ǰ0���ַ�  ��Ϊ��ʱs2����ڿ��ַ���
			for (int j = 1; j <= l2; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) // ���s1��i���ַ���s2��j���ַ����,���ò���
					dp[i][j] = dp[i - 1][j - 1];
				else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1] + 1);// ���޸Ļ����޸� ��ǰһ��״̬�ĸ��޸Ĳ���Сȡ�ĸ�
				}
			}
		}
		System.out.println(dp[l1][l2]);
	}
}
