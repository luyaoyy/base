package vjudge3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class w10 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int d = Integer.valueOf(bf.readLine());
		int n = Integer.valueOf(bf.readLine());
		String[] site=new String[n];
		int[] num=new int[n];
		String str;
		for (int i = 0; i < n; i++) {
			str = bf.readLine();
			site[i]=(str.split(" ")[0] + " " + str.split(" ")[1]);
			num[i]=(Integer.valueOf(str.split(" ")[2]));
		}
		int xmin = Integer.valueOf(site[0].split(" ")[0]);
		int xmax = Integer.valueOf(site[0].split(" ")[0]);
		int ymin = Integer.valueOf(site[0].split(" ")[1]);
		int ymax = Integer.valueOf(site[0].split(" ")[1]);
		for (int i = 0; i < n; i++) {
			if (Integer.valueOf(site[i].split(" ")[0]) < xmin)
				xmin = Integer.valueOf(site[i].split(" ")[0]);
			if (Integer.valueOf(site[i].split(" ")[0]) > xmax)
				xmax = Integer.valueOf(site[i].split(" ")[0]);
			if (Integer.valueOf(site[i].split(" ")[1]) < ymin)
				ymin = Integer.valueOf(site[i].split(" ")[1]);
			if (Integer.valueOf(site[i].split(" ")[1]) > ymax)
				ymax = Integer.valueOf(site[i].split(" ")[1]);
		}
		int xmin1 = xmin - d;
		int xmax1 = xmax + d;
		int ymin1 = ymin - d;
		int ymax1 = ymax + d;
		if (xmin1 < 0)
			xmin1 = 0;
		if (xmax1 > 1024)
			xmax1 = 1024;
		if (ymin1 < 0)
			ymin1 = 0;
		if (ymax1 > 1024)
			ymax1 = 1024;
		int min_x, min_y, max_x, max_y;
		int maxSum = 0, maxSumCount = 0,sum,x,y;
		for (int i = xmin1; i <= xmax1; i++) {
			for (int j = ymin1; j <= ymax1; j++) {
				min_x = i - d;
				max_x = i + d;
				min_y = j - d;
				max_y = j + d;
				if (min_x < 0)
					min_x = 0;
				if (max_x > 1024)
					max_x = 1024;
				if (min_y < 0)
					min_y = 0;
				if (max_y > 1024)
					max_y = 1024;

				sum = 0;
				for (int a = 0; a < n; a++) {
					x = Integer.valueOf(site[a].split(" ")[0]);
					y = Integer.valueOf(site[a].split(" ")[1]);
					if ((x >= min_x && x <= max_x) && (y >= min_y && y <= max_y)) {
						sum +=num[a];
					}
				}
				if (sum > maxSum) {
					maxSum = sum;
					maxSumCount = 1;
				} else if (sum == maxSum) {
					maxSumCount++;
				}

			}
		}
		System.out.println(maxSumCount + " " + maxSum);
	}
}