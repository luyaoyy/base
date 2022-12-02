import java.text.ParseException;
import java.text.SimpleDateFormat;

public class 完全日期 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		long s1 = sdf.parse("2001-01-01").getTime();
		long s2 = sdf.parse("2021-12-31").getTime();
		int sum = 0;
		for (long i = s1; i <= s2; i += 24 * 3600 * 1000) {
			String s = sdf.format(i);
			int a = s.charAt(0) - 48;
			int b = s.charAt(1) - 48;
			int c = s.charAt(2) - 48;
			int d = s.charAt(3) - 48;
			int e = s.charAt(5) - 48;
			int f = s.charAt(6) - 48;
			int g = s.charAt(8) - 48;
			int h = s.charAt(9) - 48;//字符转整型不能直接Integer.valueOf(字符)，结果错误
			if (Math.sqrt(a + b + c + d + e + f + g + h) % 1 == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
