package vjudge;
import java.util.*;
import java.util.ArrayList;
public class shuzu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			ArrayList<Integer> list=new ArrayList<Integer>();
			int n=s.nextInt(),m=s.nextInt();
			if(n==0 && m==0)
				break;
			else
			{
				list.add(m);
				for(int i=0;i<n;i++)
					list.add(s.nextInt());
				Collections.sort(list);
				String str=" ";
				for(int i=0;i<=n;i++)
				{
					str=str+list.get(i)+" ";
				}
				System.out.println(str.trim());
			}
		}
	}
}
