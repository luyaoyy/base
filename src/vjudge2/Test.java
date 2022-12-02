package vjudge2;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {4,5,1,2,7,3};
		Arrays.sort(a, 1, 3);
		for(int i:a)
			System.out.println(i+" ");
	}
}
