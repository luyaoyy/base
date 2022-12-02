package vjudge3;

import java.util.Scanner;

public class w02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			count++;
			int i;
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			if (a == -1 && b == -1 && c == -1 && d == -1)
				break;
			else {
				for (i = d + 1; i < 21252; i++)
					if ((i - a) % 23 == 0)
						break;
				for (; i < 21252; i = i + 23)
					if ((i - b) % 28 == 0)
						break;

				for (; i < 21252; i = i + 23 * 28)
					if ((i - c) % 33 == 0)
						break;
				System.out.println("Case " + count + ": the next triple peak occurs in " + (i - d) + " days.");
			}
		}
	}
}
