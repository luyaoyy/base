import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Road {
	int d, L, t;// 终点为d，长度为L，过路费为t
}

public class W路径 {
	public static final int MAX_NUM = 100;
	public static int K, N, R;
//邻接表cityMap[i]是从点i有路连到的城市的集合
	public static ArrayList<ArrayList<Road>> cityMap = new ArrayList<ArrayList<Road>>(MAX_NUM + 10);
	public static int minLen = 1 << 30;// 目前的最短路径的长度
	public static int totalL;// 正在走的路径的长度
	public static int totalC;// 正在走的路径的花销
	public static int vis[] = new int[MAX_NUM + 10];// 城市是否已走过的标志
	public static int minL[][] = new int[MAX_NUM + 10][MAX_NUM * MAX_NUM + 10];// 从1到i,花销为j的最短路径长度

	public static void dfs(int s) {
		if (s == N) {
			minLen = Math.min(minLen, totalL);
			return;
		}
		for (int i = 0; i < cityMap.get(s).size(); i++) {
//逐个考察s右路连到的点
			int d = cityMap.get(s).get(i).d;// s有路连到d
			if (vis[d] == 0) {
				int cost = totalC + cityMap.get(s).get(i).t;
				if (cost > K)
					continue;// 钱花超了，可行性剪枝
				if (totalL + cityMap.get(s).get(i).L >= minLen // 基本最优剪枝
						|| totalL + cityMap.get(s).get(i).L >= minL[d][cost])
					continue;// 处处最优剪枝
				totalL += cityMap.get(s).get(i).L;
				totalC += cityMap.get(s).get(i).t;
				minL[d][cost] = totalL;
				vis[d] = 1;
				dfs(d);
				vis[d] = 0;
				totalC -= cityMap.get(s).get(i).t;
				totalL -= cityMap.get(s).get(i).L;
			}
		}
	}

	public static void main(String[] args) throws Exception, IOException {
// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(bf.readLine());
		N = Integer.parseInt(bf.readLine());
		R = Integer.parseInt(bf.readLine());
		String str;
		for (int i = 0; i < MAX_NUM + 10; i++) {
			ArrayList<Road> tmp = new ArrayList<>();
			cityMap.add(tmp);
			for (int j = 0; j < MAX_NUM * MAX_NUM + 10; j++) {
				minL[i][j] = 1 << 30;
			}
		}
		for (int i = 0; i < R; i++) {
			int s;
			Road road = new Road();
			str = bf.readLine();
			String[] split = str.split("\\s+");// 一个和多个空格
			s = Integer.valueOf(split[0]);
			road.d = Integer.parseInt(split[1]);
			road.L = Integer.parseInt(split[2]);
			road.t = Integer.parseInt(split[3]);
			if (s != road.d)
				cityMap.get(s).add(road);
		}

		totalL = 0;
		totalC = 0;
		vis[1] = 1;
		minLen = 1 << 30;
		dfs(1);
		if (minLen < (1 << 30)) {
			System.out.println(minLen);
		} else {
			System.out.println("-1");
		}
	}

}
