package vjudge5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//4134
import java.util.Arrays;

public class W07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		long[] arr = new long[n];
		String s=br.readLine();
		String[] a=s.split(" ");
		for (int i = 0; i < a.length; i++) {
			arr[i] = Long.valueOf(a[i]);
		}
		int m = Integer.valueOf(br.readLine());
		Arrays.sort(arr);
		for (int j = 0; j < m; j++) {
			boolean flag = true;
			long in = Long.valueOf(br.readLine());
			if (in >= arr[n - 1])
				System.out.println(arr[n - 1]);
			else if (in <= arr[0])
				System.out.println(arr[0]);
			else {
				int min = 0, max = n - 1;
				int mid = 0;
				while (min + 1 < max) {
					mid = (min + max) / 2;
					if (arr[mid] > in) {
						max = mid;//在查询已经知道里面没有的元素是，max!=mid+1;  max=mid
					} else if (arr[mid] < in)
						min = mid;
					else {
						System.out.println(arr[mid]);
						flag = false;
						break;
					}
				}
				if (flag)
					System.out.println(Math.abs(arr[min] - in) <= Math.abs(arr[max] - in) ? arr[min] : arr[max]);
			}
		}
	}
}