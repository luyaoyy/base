import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class W排列 {
	static boolean[] flag;
	static int[] num;
	static int[] arr;
	static Set<String> set = new HashSet<>();
	static int m;
	static int n;

	static Comparator<String> C = new Comparator<String>() {
		public int compare(String s1,String s2) {
			String[] arr1=s1.trim().split("\\s+");
			String[] arr2=s2.trim().split("\\s+");
			for (int i = 0; i < arr1.length; i++) {
				if (Integer.valueOf(arr1[i]) == Integer.valueOf(arr2[i]))
					continue;
				else
					return Integer.valueOf(arr1[i]) > Integer.valueOf(arr2[i]) ? 1 : -1;
			}
			return 0;
		}
	};

	public static void dfs(int a) {
		if (a == m) {
			int[] b = new int[m];
			for (int i = 0; i < m; i++)
				b[i] = num[i];
			Arrays.sort(b);//这里不能直接对num进行排序 会影响后面的num
			String s = "";
			for (int i = 0; i < m; i++)
				s += "  "+b[i];
			set.add(s);
			return;
		} else {
			for (int i = 0; i < n; i++) {
				if (!flag[i]) {
					flag[i] = true;
					num[a] = arr[i];
					dfs(a + 1);
					flag[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		flag = new boolean[n];
		for (int i = 0; i < n; i++)
			arr[i] = i+1;
		m = sc.nextInt();
		num = new int[m];
		dfs(0);
		ArrayList<String> list=new ArrayList<>(set);
		Collections.sort(list,C);
		for(String i:list)
			System.out.println(i);
	}
}


