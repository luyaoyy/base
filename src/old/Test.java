
import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * 黄金连分数
 */
//1.化为求斐波那契相邻两项的比值，到多少项？越多越精确，n/n+1项，n再往上增加，这个比值的小数点后101位是稳定的，也就是不变的
//2.double无法表示100位小数，BigInteger和BigDecimal
public class Test {
	public static void main(String[] args) {
			BigInteger x=BigInteger.ONE;
			BigInteger y=BigInteger.ONE;
			BigInteger temp;
			for(int i=0;i<500;i++) {
				temp=x.add(y);
				x=y;
			    y=temp;
		}
		//大浮点数的除法
		BigDecimal divide = new BigDecimal(x,110).divide(new BigDecimal(y,110),BigDecimal.ROUND_HALF_DOWN);
		//截取字符串
		System.out.println(divide.toPlainString().substring(0,102));
		//0.6180339887498948482045868343656381177203091798057628621354486227052604628189024497072072041893911374
	}

}