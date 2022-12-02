package vjudge;
import java.util.*;
public class yuesefu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			int n=s.nextInt(),m=s.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			list.add(i+1);
		int id=0;
		while(list.size()>1) {
			id=(id+m-1)%list.size();
			System.out.print(list.get(id)+" ");
			list.remove(id);
//			m++;
		}
		System.out.println(list.get(0));
		}
	}
}
