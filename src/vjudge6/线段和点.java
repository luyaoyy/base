//package vjudge6;
//
//import java.util.Scanner;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
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
//public class 线段和点 {
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
//		ArrayList<Node> list = new ArrayList<>();
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
//					double max = node.get(0).max;
//					double min = node.get(0).min;
//					for (int i = 1; i < node.size(); i++) {// 区间求点问题
//						if (node.get(i).min <= max) {
//							max = Math.min(max, node.get(i).max);
//							min = Math.max(min, node.get(i).min);
//						} else {
//							ans++;
//							max = node.get(i).max;
//							min = node.get(i).min;
//							list.add(new Node(min, max));
//						}
//					}
//					System.out.println("Case " + Case + ": " + ans);
//					System.out.println(list);
//				}
//			}
//			Case++;
//		}
//	}
//}
