package vjudge;
import java.util.*;
public class gongzi {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double sum=0;
		for(int i=1;i<=12;i++)
			sum+=s.nextDouble();
		System.out.println("$"+String.format("%.2f", sum/12.0));
	}
}
