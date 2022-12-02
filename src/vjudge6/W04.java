package vjudge6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class W04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			else {
				ArrayList<Integer> Q = new ArrayList<>();
				ArrayList<Integer> T = new ArrayList<>();
				for (int i = 0; i < n; i++)
					T.add(sc.nextInt());
				for (int i = 0; i < n; i++)
					Q.add(sc.nextInt());
				Collections.sort(T);
				Collections.sort(Q);
				int money = 0;
				while (T.size() != 0) {
					int len_T = T.size(), len_Q = Q.size();
					if (T.get(len_T - 1) > Q.get(len_Q - 1)) {
						money += 200;
						T.remove(len_T - 1);
						Q.remove(len_Q - 1);
					} else if (T.get(len_T - 1) < Q.get(len_Q - 1)) {
						money -= 200;
						T.remove(0);
						Q.remove(len_Q - 1);
					} else {
						if (T.get(0) > Q.get(0)) {
							money += 200;
							T.remove(0);
							Q.remove(0);
						} else {
							money=T.get(0)<Q.get(len_Q-1)?money-200:money;
							T.remove(0);
							Q.remove(len_Q-1);
						}
					}
				}
				System.out.println(money);
			}
		}
	}
}
