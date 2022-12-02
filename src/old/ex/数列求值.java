
public class 数列求值 {
	public static void main(String[] args) {
		int[] num=new int[20190324];
		num[0]=1;
		num[1]=1;
		num[2]=1;
		for(int i=3;i<20190324;i++) {
			num[i]=(num[i-1]+num[i-2]+num[i-3])%10000;
		}
		System.out.println(num[20190323]);
	}
}
