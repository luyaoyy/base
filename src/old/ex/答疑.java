import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

class Time {
	int t1, t2, t3;

	public Time(int t1, int t2, int t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
}

public class ด๐าษ {
	static Comparator<Time> C = new Comparator<>() {
		public int compare(Time o1, Time o2) {
			return (o1.t1 + o1.t2 + o1.t3) - (o2.t1 + o2.t2 + o2.t3);
		}
	};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		Time[] t = new Time[n];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] split = s.split("\\s+");
			t[i] = new Time(Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2]));
		}
		long time = 0;
		long ans = 0;
		Arrays.sort(t, C);
		for (int i = 0; i < n; i++) {
			ans += time+t[i].t1+t[i].t2;
			time+=t[i].t1+t[i].t2+t[i].t3;
		}
		System.out.println(ans);
	}
}
