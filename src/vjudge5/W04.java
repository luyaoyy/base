package vjudge5;

import java.util.Arrays;
import java.util.Scanner;

public class W04 {
	public static boolean fun(int mid,int[] arr,int C) {
		int num=1;
		int now=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-now>=mid) {
				num++;
				now=arr[i];
				if(num>=C)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),C=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int min=0,max=arr[N-1]-arr[0];
		while(min<=max) {
			int mid=(min+max)/2;
			if(fun(mid,arr,C)) { 
				min=mid+1;
			}else {
				max=mid-1;
			}
		}
		System.out.println(min-1);
	}
}
