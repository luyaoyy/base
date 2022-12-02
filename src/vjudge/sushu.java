package vjudge;
import java.util.*;
public class sushu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while (true)
		{
			int x=s.nextInt(),y=s.nextInt();
			if(x==0 && y==0)
				break;
			else
			{
				boolean flag=true;
				for(int i=x;i<=y;i++)
				{
					int a=i*i+i+41;
					for(int j=2;j<a;j++)
					{
						if(a%j==0)
						{
							flag=false;
							break;
						}
					}
				}
					if(flag)
						System.out.println("OK");
					else
						System.out.println("Sorry");
			}
		}
	}
}
