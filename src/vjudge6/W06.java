package vjudge6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Cow {
	int A;
	int B;
	int Id;

	public Cow(int A, int B) {
		this.A = A;
		this.B = B;
	}
}

public class W06 {// 此题即贪心 会场安排问题 只是要输出每个会场的编号
	static Comparator<Cow> C = new Comparator<Cow>() {

		public int compare(Cow c1, Cow c2) {
			return c1.B - c2.B;
		}
	};

	static Comparator<Cow> C1 = new Comparator<Cow>() {

		public int compare(Cow c1, Cow c2) {
			return c1.A - c2.A;
		}
	};
	//输入数据先按开始时间升序，优先队列里的按结束时间升序
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		Cow[] cow = new Cow[N];
		int[] use = new int[N];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			cow[i] = new Cow(Integer.valueOf(s.split(" ")[0]), Integer.valueOf(s.split(" ")[1]));
			cow[i].Id = i;
		}
		Arrays.sort(cow, C1);
		Queue<Cow> list = new PriorityQueue<Cow>(C);
		for (int i = 0; i < N; i++) {
			if (list.size() != 0 && cow[i].A > list.peek().B) {
				use[cow[i].Id] = use[list.poll().Id];
			} else {
				use[cow[i].Id] = list.size() + 1;
			}
			list.add(cow[i]);
		}
		System.out.println(list.size());
		for (int i = 0; i < N; i++) {
			System.out.println(use[i]);
		}
	}
}
