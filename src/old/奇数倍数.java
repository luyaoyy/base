
public class �������� {
	public static boolean fun(String s) {
		for (int i = 0; i < s.length(); i++) {//���������ַ���������ÿ�������ַ�
			if ((s.charAt(i) - 48) % 2 == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 2;; i++) {
			long n = 2019 * i;
			if (fun(n + "")) {
				System.out.println(n);
				break;
			}
		}
	}
}
