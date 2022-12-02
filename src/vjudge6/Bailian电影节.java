package vjudge6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class No {
	int min, max;

	public No(int min, int max) {
		this.min = min;
		this.max = max;
	}

}

public class Bailian电影节 {//贪心
	static Comparator<No> C = new Comparator<No>() {
		public int compare(No c1, No c2) {
			return c1.max - c2.max;
		}
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			No[] node = new No[n];
			for (int i = 0; i < n; i++) {
				node[i] = new No(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(node,C);
			int end=0,sum=0;
			for(int i=0;i<n;i++) {
				if(node[i].min>=end) {
					end=node[i].max;
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
