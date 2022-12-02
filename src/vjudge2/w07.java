package vjudge2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class w07 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			int sum = Integer.valueOf(arr[2]);
			String date1 = "2022" + "-" + arr[0] + "-" + arr[1];
			String date2 = "2022" + "-" + arr[3] + "-" + arr[4];
			long m1 = sdf.parse(date1).getTime();
			long m2 = sdf.parse(date2).getTime();
			long m = m2 - m1;
			long day = m / 86400000;
			for (int j = 0; j < (int) day; j++) {
				sum *= 2;
			}
			System.out.println(sum);
		}
	}
}
