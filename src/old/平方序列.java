
public class 平方序列 {
	public static void main(String[] args) {
		int x=0;
		for(int i=2020;;i++) {
			if(Math.sqrt(2*i*i-2019*2019)%1==0) {//判断整数对1求余
				x=i;
				break;
			}
		}
		int y=(int)Math.sqrt(2*x*x-2019*2019);
		System.out.println(y+x);
	}
}
