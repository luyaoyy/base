package vjudge3;

import java.util.Scanner;

public class w04 {
	public static boolean check(int[][] arr, int n) {
		boolean flag = true;
		for (int k = 0; k < 6; k++) {
			if (arr[n][k] == 1) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] con = new int[5][6];// a灯状态 b按下的开关;
		int[][] con1 = new int[5][6];
		int[][] swit = new int[5][6];
		for (int i = 0; i < 5; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			con[i][0] = Integer.valueOf(arr[0]);
			con[i][1] = Integer.valueOf(arr[1]);
			con[i][2] = Integer.valueOf(arr[2]);
			con[i][3] = Integer.valueOf(arr[3]);
			con[i][4] = Integer.valueOf(arr[4]);
			con[i][5] = Integer.valueOf(arr[5]);
		}
		boolean flag = false;
		for (int a = 0; a <= 1; a++) {
			for (int b = 0; b <= 1; b++) {
				for (int c = 0; c <= 1; c++) {
					for (int d = 0; d <= 1; d++) {
						for (int e = 0; e <= 1; e++) {
							for (int f = 0; f <= 1; f++) {
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 6; j++) {
										swit[i][j] = 0;
									}
								}
								swit[0][0] = a;
								swit[0][1] = b;
								swit[0][2] = c;
								swit[0][3] = d;
								swit[0][4] = e;
								swit[0][5] = f;
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 6; j++) {
										con1[i][j] = con[i][j];
									}
								}
								for (int i = 0; i < 6; i++) {
									if (swit[0][i] == 1) {
										int l = i - 1;
										int r = i + 1;
			
										if (l < 0) {
											con1[0][r] = con1[0][r] == 0 ? 1 : 0;
											con1[1][i] = con1[1][i] == 0 ? 1 : 0;
											con1[0][i] = con1[0][i] == 0 ? 1 : 0;
										} else if (r > 5) {
											con1[0][l] = con1[0][l] == 0 ? 1 : 0;
											con1[1][i] = con1[1][i] == 0 ? 1 : 0;
											con1[0][i] = con1[0][i] == 0 ? 1 : 0;
										} else {
											con1[0][l] = con1[0][l] == 0 ? 1 : 0;
											con1[0][r] = con1[0][r] == 0 ? 1 : 0;
											con1[1][i] = con1[1][i] == 0 ? 1 : 0;
											con1[0][i] = con1[0][i] == 0 ? 1 : 0;
										}
									}
								}
								for (int i = 1; i < 4; i++) {
									for (int j = 0; j < 6; j++) {
										if (con1[i - 1][j] == 1) {
											swit[i][j] = 1;
											con1[i - 1][j] = 0;
											int down = i + 1;
											int l = j - 1;
											int r = j + 1;
					
											if (l < 0) {
												con1[i][j] = con1[i][j] == 0 ? 1 : 0;
												con1[i][r] = con1[i][r] == 0 ? 1 : 0;
												con1[down][j] = con1[down][j] == 0 ? 1 : 0;
											} else if (r > 5) {
												con1[i][j] = con1[i][j] == 0 ? 1 : 0;
												con1[i][l] = con1[i][l] == 0 ? 1 : 0;
												con1[down][j] = con1[down][j] == 0 ? 1 : 0;
											} else {
												con1[i][j] = con1[i][j] == 0 ? 1 : 0;
												con1[i][l] = con1[i][l] == 0 ? 1 : 0;
												con1[i][r] = con1[i][r] == 0 ? 1 : 0;
												con1[down][j] = con1[down][j] == 0 ? 1 : 0;
											}
										}
									}
								}
								for (int i = 0; i < 6; i++) {
									if (con1[3][i] == 1) {
										swit[4][i] = 1;
										con1[3][i] = 0;
										int l = i - 1;
										int r = i + 1;

										if (l < 0) {
											con1[4][r] = con1[4][r] == 0 ? 1 : 0;
											con1[4][i] = con1[4][i] == 0 ? 1 : 0;
										} else if (r > 5) {
											con1[4][l] = con1[4][l] == 0 ? 1 : 0;
											con1[4][i] = con1[4][i] == 0 ? 1 : 0;
										} else {
											con1[4][r] = con1[4][r] == 0 ? 1 : 0;
											con1[4][l] = con1[4][l] == 0 ? 1 : 0;
											con1[4][i] = con1[4][i] == 0 ? 1 : 0;
										}
									}
								}
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 6; j++) {
										System.out.print(con1[i][j] + " ");
									}
									System.out.println();
								}
								System.out.println();
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 6; j++) {
										System.out.print(swit[i][j] + " ");
									}
									System.out.println();
								}
								System.out.println();
							}
						}
					}
				}
			}
		}
	}
}
