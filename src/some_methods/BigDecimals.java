package w一些方法;
import java.util.Scanner;
import java.math.BigDecimal;
public class BigDecimals {//注意后缀要去0 0.5+0.5==1 不是1.0
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new BigDecimal(sc.next()).add(new BigDecimal(sc.next())).toString();
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='.')
				break;
			if(s.charAt(i)=='0') {
				s=s.substring(0,i);
			}else
				break;
		}
		if(s.charAt(s.length()-1)=='.')
			System.out.println(s.substring(0,s.length()-1));
		else
			System.out.println(s);
	}
}
