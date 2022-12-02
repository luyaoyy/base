package vjudge;
import java.util.*;
public class yuesefu1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer > list=new ArrayList();
		while(true) {
			int k=s.nextInt(),m;
			if(k==0)
				break;
			else {
				for(int u=k+1;;u++) {
					for(int j=0;;j++)
					{
						int n=0;
						m=u+2*k*j;
						list.clear();
						for(int i=0;i<2*k;i++)
							list.add(i+1);
						int id=-1;
						while(list.size()>k) {
							id=(id+m)%list.size();
							if(id<=k-1)
							{
								n++;
								break;
							}
							list.remove(id);
							id--;
						}
						if(n!=0)
							break;
						if(list.size()==k)
							break;	
				}
					if(list.size()==k)
						break;	
				}
				System.out.println(m);
			}
		}
	}
}
