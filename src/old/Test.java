
import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * �ƽ�������
 */
//1.��Ϊ��쳲�������������ı�ֵ���������Խ��Խ��ȷ��n/n+1�n���������ӣ������ֵ��С�����101λ���ȶ��ģ�Ҳ���ǲ����
//2.double�޷���ʾ100λС����BigInteger��BigDecimal
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
		//�󸡵����ĳ���
		BigDecimal divide = new BigDecimal(x,110).divide(new BigDecimal(y,110),BigDecimal.ROUND_HALF_DOWN);
		//��ȡ�ַ���
		System.out.println(divide.toPlainString().substring(0,102));
		//0.6180339887498948482045868343656381177203091798057628621354486227052604628189024497072072041893911374
	}

}