package vjudge6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Node {
	int min;
	int max;

	public Node(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public String tos() {
		return min + " " + max;
	}
}

public class Test {
	static Comparator<Node> C = new Comparator<Node>() {
		public int compare(Node o1, Node o2) {
			if (o1.min == o2.min) {
				return o1.max > o2.max ? 1 : -1;
			} else
				return o1.min > o2.min ? 1 : -1;
		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		ArrayList<Node> node = new ArrayList<Node>();
		ArrayList<Node> list = new ArrayList<>();
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextInt();
		for (int i = 0; i < m; i++) {
			node.add(new Node(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(node, C);
		int max = node.get(0).max;
		int min = node.get(0).min;
		for (int i = 1; i < node.size(); i++) {// 区间求点问题
			if (node.get(i).min <= max) {
				max = Math.min(max, node.get(i).max);
				min = Math.max(min, node.get(i).min);
				if (i == node.size() - 1)
					list.add(new Node(min, max));
			} else {
				list.add(new Node(min, max));
				max = node.get(i).max;
				min = node.get(i).min;
				if (i == node.size() - 1)
					list.add(new Node(min, max));
			}
		}
		System.out.println(list.size());
	}
}
