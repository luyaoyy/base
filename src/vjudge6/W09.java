package vjudge6;

import java.util.Arrays;
import java.util.Scanner;

public class W09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),B=sc.nextInt();
		int[] height=new int[N];
		for(int i=0;i<N;i++)
			height[i]=sc.nextInt();
		Arrays.sort(height);
		int min=0;
		int sum=0;
		for(int i=N-1;i>=0;i--) {
			if(sum>=B) {
				break;
			}else {
				sum+=height[i];
				min+=1;
			}
		}
		System.out.println(min);
	}
}
