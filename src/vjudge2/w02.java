package vjudge2;

import java.util.*;

class A {
	int min, max;

	public A(int min, int max) {
		this.max = max;
		this.min = min;
	}

	public String toString() {
		return min + " " + max;
	}
}

public class w02 {
	static Comparator<A> c = new Comparator<A>() {
		public int compare(A o1, A o2) {
			if (o1.min == o2.min) {
				return o1.max - o2.max;
			} else
				return o1.min - o2.min;
		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(), M = sc.nextInt();
		ArrayList<A> list = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			A a = new A(sc.nextInt(), sc.nextInt());
			list.add(a);
		}
		Collections.sort(list, c);
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).min == list.get(i + 1).min) {
				if (list.get(i + 1).max >= list.get(i).max) {
					list.remove(i);
					i--;
				}
			} else if (list.get(i + 1).min < list.get(i).max) {
				if (list.get(i + 1).max <= list.get(i).max) {
					list.remove(i + 1);
					i--;
				} else {
					list.set(i, new A(list.get(i).min, list.get(i + 1).max));
					list.remove(i + 1);
					i--;
				}
			}
		}
		int a = 0;
		for (int i = 0; i < list.size(); i++) {
			a += list.get(i).max - list.get(i).min + 1;
		}
		System.out.println(L - a + 1);
	}
}
