package vjudge5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Dict {
	String s1;
	String s2;

	public Dict(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
}

public class W02 {
	static Comparator<Dict> C = new Comparator<Dict>() {
		public int compare(Dict o1, Dict o2) {
			return o1.s2.compareTo(o2.s2);
		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Dict> list = new ArrayList<>();
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if(s.equals(""))
				break;
			String s1 = s.split(" ")[0];
			String s2 = s.split(" ")[1];
			list.add(new Dict(s1, s2));

		}
		Collections.sort(list, C);
		while (sc.hasNext()) {
			String s = sc.next();
			int min = 0, max = list.size() - 1;
			boolean flag = true;
			while (min <= max) {
				int mid = (min + max) / 2;
				if (s.compareTo(list.get(mid).s2) < 0)
					max = mid - 1;
				else if (s.compareTo(list.get(mid).s2) > 0)
					min = mid + 1;
				else {
					System.out.println(list.get(mid).s1);
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("eh");
		}
	}
}
