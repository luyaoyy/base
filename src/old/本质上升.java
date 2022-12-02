import java.util.Arrays;

public class ±æ÷ …œ…˝ {
	public static void main(String[] args) {
		String s = "tocyjkdzcieoiodfpbgcncsrjbhmugdnojjddhllnofawllbhf"
				+ "iadgdcdjstemphmnjihecoapdjjrprrqnhgccevdarufmliqij"
				+ "gihhfgdcmxvicfauachlifhafpdccfseflcdgjncadfclvfmad"
				+ "vrnaaahahndsikzssoywakgnfjjaihtniptwoulxbaeqkqhfwl";
		int len = s.length();
		int[] dp = new int[len + 1];
		Arrays.fill(dp, 1);
		dp[0]=0;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j < i; j++) {
				if (s.charAt(i - 1) > s.charAt(j - 1)) {
					dp[i] += dp[j];
				} else if (s.charAt(i - 1) == s.charAt(j - 1)) {
					dp[i] -= dp[j];
				}
			}
		}
		int sum = 0;
		for (int i : dp)
			sum += i;
		System.out.println(sum);
	}
}
