
public class ��ֵ {
	public static void main(String[] args) {
		for (int i = 1;; i++) {
			int ans = 0;
			for (int j = 1; j <=Math.sqrt(i); j++) {
				if (i % j == 0) {//j������ƽ�������Ҹ�һ��Լ�� Լ��������2
					ans+=2;
				}else if(j*j==i)
					ans++;
			}
			if (ans == 100) {
				System.out.println(i);
				break;
			}
		}
	}
}
