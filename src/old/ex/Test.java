
public class Test {

	public Test() {
		int sum = 0;
		int a = 1;
		for (int i = 1; i <= 60; i++) {// ȡ60λ
			int count = 0;
			a = 1;// ÿ�ζ���1��ʼ�ң�����©��

			// ��Ϊ�ǰ�����ϵ��Լ���������ڵ��ڶ�����Ҫ��
			while (count < i) {
				count = 0;// ��¼��ǰa��Լ������
				for (int j = 1; j <= a; j++) {
					if (a % j == 0)
						count++;
				}
				a++;
			}
			if (count >= i) {
				// ��Ϊ��ѭ��������a����˸�1�������ȥ
				sum += (a - 1);
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		new Test();

	}
}