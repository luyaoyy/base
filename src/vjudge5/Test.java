package vjudge5;

import java.util.Arrays;
import java.util.Scanner;
//用二分法查找方法查找指定的一个数

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] A = { 1, 3, 5, 8, 4, 1 };
		Arrays.sort(A);
		int x = sc.nextInt();
		int low = 0, high = A.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (A[mid] == x) {
				System.out.println(A[mid]);
				break;
			} else if (x < A[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

	}
}
