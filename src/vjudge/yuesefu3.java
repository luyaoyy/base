package vjudge;
import java.util.*;
public class yuesefu3 {
	public static void Joseph(int k) {
		int rest;
		int p;
		for(int m=k+1;;m++) {
			for(rest =2*k,p=0;rest>k;rest--) {
				p=(p+m-1)%rest;
				if(p<k)
					rest=0;
			}
			if(rest==k) {
				System.out.println(m);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			int k=s.nextInt();
			if(k==0)
				break;
			Joseph(k);
		}
	}
}
