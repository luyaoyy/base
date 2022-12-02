package vjudge3;

import java.util.ArrayList;
import java.util.Scanner;

public class w01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			boolean[] flag = new boolean[12];
			int[] coin = new int[12];
			ArrayList<String> left = new ArrayList<>();
			ArrayList<String> right = new ArrayList<>();
			ArrayList<String> condition = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				String str = sc.nextLine();
				String[] arr = str.split(" ");
				left.add(arr[0]);
				right.add(arr[1]);
				condition.add(arr[2]);
			}
			for (int j = 0; j < 3; j++) {
				if (condition.get(j).equals("even")) {
					for (int x = 0; x < left.get(j).length(); x++) {
						flag[left.get(j).charAt(x) - 65] = true;
					}
					for (int x = 0; x < right.get(j).length(); x++) {
						flag[right.get(j).charAt(x) - 65] = true;
					}
				}
			}
			for (int j = 0; j < 12; j++) {
				if (!flag[j]) {
					coin[j] = -1;
					for (int x = 0; x < 3; x++) {
						int l, r;
						if (!(condition.get(x).equals("even"))) {
							l = 0;
							r = 0;
							for (int u = 0; u < left.get(x).length(); u++) {
								l += coin[left.get(x).charAt(u) - 65];
							}
							for (int u = 0; u < right.get(x).length(); u++) {
								r += coin[right.get(x).charAt(u) - 65];
							}
							if (condition.get(x).equals(l > r ? "up" : "down")) {
								continue;
							} else {
								coin[j] = 0;
								break;
							}
						}
					}
					if (coin[j] == 0) {
						coin[j] = 1;
						for (int x = 0; x < 3; x++) {
							if (!(condition.get(x).equals("even"))) {
								int l = 0, r = 0;
								for (int u = 0; u < left.get(x).length(); u++) {
									l += coin[left.get(x).charAt(u) - 65];
								}
								for (int u = 0; u < right.get(x).length(); u++) {
									r += coin[right.get(x).charAt(u) - 65];
								}
								if (condition.get(x).equals(l > r ? "up" : "down")) {
									continue;
								} else {
									coin[j] = 0;
									break;
								}
							}
						}
					}
				}
				if (coin[j] == 1 || coin[j] == -1) {
					break;
				}
			}
			for (int j = 0; j < 12; j++) {
				if (coin[j] != 0) {
					if(coin[j]==1)
						System.out.println((char)(j+65)+" is the counterfeit coin and it is heavy. ");
					else
						System.out.println((char)(j+65)+" is the counterfeit coin and it is light. ");
				}
			}
		}
	}
}
