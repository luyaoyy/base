package wһЩ����;
import java.util.*;
public class w�ָ���ָ�� {
	public static void main(String[] args) {
		System.out.println(Arrays.toString("a b c d".split("((?<=\\ )|(?=\\ ))")));
		System.out.println(Arrays.toString("10+10-6*9/9".split("((?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)|(?=\\*)|(?<=\\*)|(?=\\/)|(?<=\\/))")));
		String str = "a;b;b;v;";
		String[] a = str.split("(?<=;)|(?=;)");// ����ָ�����÷�
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
