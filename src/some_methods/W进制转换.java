package w一些方法;

import java.util.Scanner;

public class W进制转换 {
	public static void main(String[] args) {
//		int a=-10;
//		System.out.println(Integer.toString(a,8));//把a转16进制
		//Integer.parseInt(x,16):把一个16进制的数(字符串形式)转成10进制
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Hex: "+"0x"+s);
		System.out.println("Decimal: "+Integer.parseInt(s,16));
		System.out.println("Octal: "+String.format("%04d", Integer.valueOf(Integer.toString(Integer.parseInt(s,16),8))));
	}
}
