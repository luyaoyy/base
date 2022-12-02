package vjudge3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class v10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int d = Integer.valueOf(bf.readLine());
		int n = Integer.valueOf(bf.readLine());
		String[] site = new String[n];
		int[] num = new int[n];
		List<String> ard = new LinkedList<>();
		List<Integer> all = new LinkedList<>();
		String str;
		for (int i = 0; i < n; i++) {
			str = bf.readLine();
			site[i] = (str.split(" ")[0] + " " + str.split(" ")[1]);
			num[i] = (Integer.valueOf(str.split(" ")[2]));
		}
		int maxSum=0,maxSumCount=0;
		for (int i = 0; i < site.length; i++) {
			int xmin = Integer.valueOf(site[i].split(" ")[0]) - d;
			int xmax = Integer.valueOf(site[i].split(" ")[0]) + d;
			int ymin = Integer.valueOf(site[i].split(" ")[1]) - d;
			int ymax = Integer.valueOf(site[i].split(" ")[1]) + d;
			if (xmin < 0)
				xmin = 0;
			if (xmax > 1024)
				xmax = 1024;
			if (ymin < 0)
				ymin = 0;
			if (ymax > 1024)
				ymax = 1024;
			int min_x, min_y, max_x, max_y;
			for (int j = xmin; j <= xmax; j++) {
				for (int k = ymin; k <= ymax; k++) {
					min_x = j - d;
					max_x = j + d;
					min_y = k - d;
					max_y = k + d;
					if (min_x < 0)
						min_x = 0;
					if (max_x > 1024)
						max_x = 1024;
					if (min_y < 0)
						min_y = 0;
					if (max_y > 1024)
						max_y = 1024;
					int sum = 0;
					for (int a = 0; a < n; a++) {
						int x = Integer.valueOf(site[a].split(" ")[0]);
						int y = Integer.valueOf(site[a].split(" ")[1]);
						if ((x >= min_x && x <= max_x) && (y >= min_y && y <= max_y)) {
							sum += num[a];
						}
					}
					if (sum > maxSum) {
						maxSum = sum;
						maxSumCount=1;
						ard.add(j+" "+k);
					}else if(sum==maxSum){
						if(!ard.contains(j+" "+k)) {
							ard.add(j+" "+k);
							maxSumCount++;
						}
					}
				}
			}
		}
		System.out.println(maxSumCount + " " + maxSum);
	}
}
