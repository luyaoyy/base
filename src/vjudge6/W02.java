package vjudge6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class W02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++)
				list.add(Integer.valueOf(s.split(" ")[i]));
			int max = Collections.max(list);
			int num = 0;
			double MaxTime = 0;
			Collections.sort(list,Collections.reverseOrder());
			for (int i = 0; i < n; i++) {
				if (list.get(i) != max)
					break;
				else
					num++;
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (list.get(i) != max)
					sum+=list.get(i);
			}
			if (sum < max) {
				MaxTime +=sum;
				MaxTime += (num - 1) / 2 * max;
			} else {
				MaxTime += (num*max + sum) / 2.0;
				
			}
			System.out.println(String.format("%.1f",MaxTime ));
		}
	}
}
