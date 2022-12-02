package vjudge2;
import java.util.*;
public class w08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4!=0||(year%100==0&&year%400!=0)||year%3200==0)
			System.out.println("N");
		else
			System.out.println("Y");
	}
}
