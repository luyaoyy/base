package w一些方法;

import java.util.*;
import java.math.*;

public class w分割split用法 {

	public static void main(String[] args) {
//		String str = "dasd,ijij+adds%dd.asd&das";
//		String[] a = str.split("\\,|\\+|\\%|\\.|\\&");// 多个分割符的用法
//		for (int i = 0; i < a.length; i++)
//			System.out.println(a[i]);
		String s=" sadasd   asdee";
		for(String i:s.split("\\s+"))
			System.out.println(i);
	}
}
