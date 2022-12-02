
public class ÐòÁÐÇóºÍ {
	public static void main(String[] args) {
		int sum = 0;
		int now=1;
		for (int i = 1;; i++) {
			int a=0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					a++;
				}
			}
			if(now==a) {
				i=1;
				now++;
				sum+=i;
			}
			System.out.println(now);
			if (now == 61) {
				System.out.println(sum);
				break;
			}
		}
	}
}
