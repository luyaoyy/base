
import java.util.Scanner;

public class ������ {

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
	        	result=result*base%c;//����дresult*=result%c
	        	base=base*base%c;
	        }
		}
		System.out.println(result);
	}
}