
import java.util.Scanner;

public class 快速幂 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long base = sc.nextLong(), power = sc.nextLong(),c=sc.nextLong();
		long result = 1;
		while (power > 0) {
	        if (power % 2 == 0) {
	        	power/=2;
	            base=base*base%c;
	        }else {
	        	power/=2;
	        	result=result*base%c;//不能写result*=result%c
	        	base=base*base%c;
	        }
		}
		System.out.println(result);
	}
}