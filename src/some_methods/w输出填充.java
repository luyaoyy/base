package w一些方法;

public class w输出填充 {
	public static void main(String[] args) {
		int a=20;
		//要求输出的是5位数
		System.out.println(String.format("%05d",a));
		//05d中的0其实是用于填充的
		//要求保留5为小数
		double b=5;
		System.out.println(String.format("%.5f", b));
	}
}
