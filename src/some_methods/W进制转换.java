package wһЩ����;

import java.util.Scanner;

public class W����ת�� {
	public static void main(String[] args) {
//		int a=-10;
//		System.out.println(Integer.toString(a,8));//��aת16����
		//Integer.parseInt(x,16):��һ��16���Ƶ���(�ַ�����ʽ)ת��10����
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Hex: "+"0x"+s);
		System.out.println("Decimal: "+Integer.parseInt(s,16));
		System.out.println("Octal: "+String.format("%04d", Integer.valueOf(Integer.toString(Integer.parseInt(s,16),8))));
	}
}
