package vjudge;

import java.util.Scanner;
public class tt {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			int n=s.nextInt(),m=s.nextInt();
			if(n==0 && m==0)
				break;
				int[] arr=new int[n];
				for(int i=0;i<n;i++)
					arr[i]=s.nextInt();
				int[] arr1=new int[n+1];
				for(int j=0;j<n;j++)
					arr1[j]=arr[j];
				arr1[n]=m;
				for(int i=0;i<arr1.length;i++)
				{
					for(int j=0;j<arr1.length-i-1;j++)
					{
						if(arr1[j]>arr1[j+1])
						{
							int t=arr1[j];arr1[j]=arr1[j+1];arr1[j+1]=t;
						}
					}
				}
				String str=" ";
				for(int i=0;i<arr1.length;i++)
				{
					str=str+arr1[i]+" ";
				}
				System.out.println(str.trim());
		}
	}
}
