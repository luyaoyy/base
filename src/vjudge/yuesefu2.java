package vjudge;
import java.util.*;
public class yuesefu2{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
			int k=s.nextInt();
			if(k==0)
				break;
			else {
				int rest,id;
				for(int m=k+1;;m++) {
					for(rest=2*k,id=0;rest>k;rest--) {
						id=(id+m-1)%rest;
						if(id<k)
							break;
					}
					if(rest==k) {
						System.out.println(m);
						break;
					}
				}
			}
		}
	}
}