
public class µÈ²îËØÊıÁĞ {
	static boolean[] prime;

	public static void main(String[] args) {
		prime = new boolean[10000];
		for (int i = 2; i < 10000; i++) {
			if (!prime[i]) {
				for (int j = 2 * i; j < 10000; j += i)
					prime[j] = true;
			}
		}
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				int len = 1;
				int a = i;
				while (true) {
					a += j;
					if (prime[a]) {
						break;
					}
					len++;
					if(len==10) {
						System.out.println(j);
						return;
					}
				}
			}
		}
	}
}
