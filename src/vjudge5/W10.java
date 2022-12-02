//package vjudge5;
//import java.util.Arrays;
//import java.util.Scanner;
//
////4143
//public class W10{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		long[] arr = new long[n];
//		for (int i = 0; i < n; i++)
//			arr[i] = sc.nextLong();
//		long m = sc.nextLong();
//		Arrays.sort(arr);
//		boolean flag = true;
//		for (int i = 0; i < n - 1; i++) {
//			int min = i + 1, max = n - 1;
//			while (min+1  < max) {
//				int mid = (min + max) / 2;
//				if (arr[mid] + arr[i] < m)
//					min = mid;
//				else if (arr[mid] + arr[i] > m)
//					max = mid;
//				else {
//					flag = false;
//					System.out.println(arr[i] + " " + arr[mid]);
//					return;
//				}
//			}
//		}
//		if (flag)
//			System.out.println("No");
//	}
//}