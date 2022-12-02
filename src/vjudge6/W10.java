package vjudge6;

import java.util.ArrayList;
import java.util.Scanner;

public class W10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		while (m!=0) {
			String n = sc.next();
			int k = sc.nextInt();
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i < n.length(); i++)
				list.add(n.substring(i, i + 1));
			while (k != 0) {
				boolean flag=true;
				for (int i = list.size() - 1; i >= 1; i--) {
					if(Integer.valueOf(list.get(i))<Integer.valueOf(list.get(i-1))) {
						list.remove(i-1);
						flag=false;
						break;
					}
				}
				if(flag)
					list.remove(list.get(list.size()-1));
				k--;
			}
			for(String i:list)
				System.out.print(i);
			System.out.println();
			m--;
		}
	}
}
