import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class 求和 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine().trim());
		int[] a=new int[n];
		String s=br.readLine();
		String[] b=s.split("\\s+");
		for(int i=0;i<n;i++)
			a[i]=Integer.valueOf(b[i]);
		BigInteger sum=new BigInteger("0");
		long[] dp=new long[n];
		dp[0]=a[0];
		for(int i=1;i<n;i++) {//前缀和 S=a1*(a2+a3+a4+a5)+a2*(a3+a4+a5)+a3*(a4+a5)+a4*a5
			dp[i]=dp[i-1]+a[i];
		}
		for(int i=0;i<n;i++) {
			sum=sum.add(BigInteger.valueOf(a[i]*(dp[n-1]-dp[i])));
		}
		System.out.println(sum);
	}
}
