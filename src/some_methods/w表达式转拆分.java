package w一些方法;

import java.util.*;

public class w表达式转拆分 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < str.length();) {
			if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				list.add(str.charAt(i)+"");
				i++;
			}
			else {
				String str1 = "";
				while(i<str.length()&&str.charAt(i)<='9'&&str.charAt(i)>='0') {
					str1+=str.charAt(i)+"";
					i++;
				}
				list.add(str1);
			}
		}
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}
