package 动态规划;

import java.util.Scanner;

public class 合唱队形 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		String[] a=s.split("\\s+");
		int[] h=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=Integer.valueOf(a[i]);
		}
		int[] left=new int[n];
		int[] right=new int[n];
		for(int i=0;i<n;i++) {
			left[i]=1;
			for(int j=0;j<i;j++) {
				if(h[i]>h[j])
					left[i]=Math.max(left[i], left[j]+1);
			}
		}
		for(int i=n-1;i>=0;i--) {
			right[i]=1;
			for(int j=n-1;i<j;j--) {
				if(h[i]>h[j]) {
					right[i]=Math.max(right[i], right[j]+1);
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++) {
			max=Math.max(max, left[i]+right[i]);
		}
		System.out.println(n-max+1);
	}
}
