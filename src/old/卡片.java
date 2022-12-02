import java.util.Arrays;

public class ¿¨Æ¬ {
	static int[] card = new int[10];

	public static boolean reduce(int i) {
		String num = String.valueOf(i);
		char[] c = num.toCharArray();
		for (int j = 0; j < c.length; j++) {
			if (card[c[j] - 48] == 0)
				return false;
			card[c[j] - 48]--;
		}
		return true;
	}

	public static void main(String[] args) {
		Arrays.fill(card, 2021);
		for (int i = 1;; i++) {
			if (!reduce(i)) {
				System.out.println(i - 1);
				break;
			}
		}
	}
}
