
import java.math.BigInteger;
import java.util.Scanner;
//除法求余公式
public class 小数点后n位 {
	static BigInteger mod=BigInteger.valueOf(1000);
	static BigInteger MOD;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        long n=sc.nextInt();
        n=n+2;
        BigInteger ans=BigInteger.valueOf(1);
        BigInteger base=BigInteger.valueOf(10);
         MOD=b.multiply(mod);
        while(n>0) {
        	if(n%2==0) {
        		base=base.pow(2).mod(MOD);
        		n/=2;
        	}else {
        		n-=1;
        		ans=ans.multiply(base).mod(MOD);
        		n/=2;
        		base=base.pow(2).mod(MOD);
        	}
        }
        System.out.println(a.mod(MOD).multiply(ans).mod(MOD).divide(b));
    }
}

