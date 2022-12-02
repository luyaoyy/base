package vjudge2;
import java.util.*;
public class w01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int sum=sc.nextInt();
			int min,max;
			if(sum%4==0)
				min=sum/4;
			else if(sum%4%2==0)
				min=sum/4+1;
			else
				min=0;
			if(sum%2==0)
				max=sum/2;
			else
				max=0;
			System.out.println(min+" "+max);	
		}
	}
}
