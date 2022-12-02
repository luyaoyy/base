package w一些方法;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Cow {
	int A;
	int B;
	int Id;

	public Cow(int A, int B) {
		this.A = A;
		this.B = B;
	}
}

public class W优先队列 {

	static Comparator<Cow> C = new Comparator<Cow>() {

		public int compare(Cow c1, Cow c2) {
			return c1.B - c2.B;
		}
	};
	public static void main(String[] args) {
		
		Queue<Cow> queue = new PriorityQueue<>(C);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			queue.add(new Cow(sc.nextInt(),sc.nextInt()));
		}
		while(!queue.isEmpty())
			System.out.println(queue.poll().B);
		
//		while (!queue.isEmpty()) {
//			System.out.print(queue.poll() + " ");
//		}
	}
		
	

}
