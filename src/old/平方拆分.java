
public class ƽ����� {
	public static int sum = 0,max = 45;
	public static void main(String[] args) {
		dfs(2019,1);
		System.out.println(sum);
	}
	public static void  dfs(int num, int min) {
		if (num < 0) {
			return;
		}
		if (num == 0) {
			sum ++;
			return;
		}
		for (int i = min; i < max; i++) {
			dfs(num - i * i, i + 1);
		}//��2019��ȥƽ��������һ��ʼ�����ѣ�����պ�Ϊ0������һ�ַ���
	}

}
