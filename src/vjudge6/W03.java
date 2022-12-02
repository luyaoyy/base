//package vjudge6;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class Node {
//	double min;
//	double max;
//
//	public Node(double min, double max) {
//		this.min = min;
//		this.max = max;
//	}
//}
//
//public class W03 {
//	static Comparator<Node> C = new Comparator<Node>() {
//		public int compare(Node o1, Node o2) {
//			if (o1.min == o2.min) {
//				return o1.max > o2.max ? 1 : -1;
//			} else
//				return o1.min > o2.min ? 1 : -1;
//		}
//	};
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int Case = 1;
//		while (true) {
//			int n = sc.nextInt(), d = sc.nextInt();
//			if (n == 0 && d == 0)
//				break;
//			else {
//				ArrayList<Node> node = new ArrayList<Node>();
//				boolean flag = true;
//				for (int i = 0; i < n; i++) {
//					int x = sc.nextInt();
//					int y = sc.nextInt();
//					if (y > d) {
//						flag = false;
//					} else {
//						double min = x - Math.sqrt(d * d - y * y);
//						double max = x + Math.sqrt(d * d - y * y);
//						node.add(new Node(min, max));
//					}
//				}
//				if (!flag) {
//					System.out.println("Case " + Case + ": " + "-1");
//				}
//				if (flag) {
//					Collections.sort(node, C);
//					int ans = 1;
//					double now = node.get(0).max;
//					for (int i = 1; i < node.size(); i++) {//区间求点问题
//						if (node.get(i).min <= now)
//							now = Math.min(now, node.get(i).max);
//						else {
//							ans++;
//							now = node.get(i).max;
//						}
//					}
//					System.out.println("Case " + Case + ": " + ans);
//				}
//			}
//			Case++;
//		}
//	}
//}
