
import java.util.Scanner;

public class ������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next();
		int l2 = s2.length();
		int max = 0;
		String ss = s1;
		for (int i = 0; i < l2; i++) {
			String c = s2.substring(i, i + 1);
			int id = ss.indexOf(c);// �����ַ���,�ӵ�һ�γ��ֵĵط������
			if (id != -1) {
				max++;
				ss = ss.substring(id + 1, ss.length());
			} else {
				System.out.println(max);
				break;
			}
		}
	}
}
