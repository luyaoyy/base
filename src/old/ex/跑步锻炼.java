
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ≈‹≤Ω∂Õ¡∂ {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String s1="2000-01-01",s2="2020-10-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat week = new SimpleDateFormat("EEEE");
		int sum=0;
		for(long i=Long.valueOf("946656000000");i<=Long.valueOf("1601481600000");i+=24*3600*1000) {
			String month=sdf.format(i).substring(8,10);
			String we=week.format(i);
			if(month.equals("01")||we.equals("–«∆⁄“ª")) {
				sum+=2;
			}else
				sum+=1;
		}
		System.out.println(sum);
	}
}
//946656000000
//1601481600000