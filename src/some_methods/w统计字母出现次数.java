package w一些方法;
import java.util.*;
public class w统计字母出现次数 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int[] arr=new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]!=0)
				System.out.println((char)(i+97)+":"+arr[i]);
		}
	}
}
