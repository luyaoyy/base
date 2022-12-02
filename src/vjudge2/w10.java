package vjudge2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class w10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n],left=new int[n],right=new int[n],surplse=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					left[i]=Math.max(left[i],left[j]+1);
				}
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[i]>arr[j]) {
					right[i]=Math.max(right[i], right[j]+1);
				}
			}
		}
		for(int i=0;i<n;i++) {
			surplse[i]=right[i]+left[i]+1;
		}
		int max=1;
		for(int i:surplse) {
			max=Math.max(max, i);
		}
		System.out.println(n-max);
	}
}
