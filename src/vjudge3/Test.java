package vjudge3;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.*;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		String s="6668566666664666666666666";
		int max=0;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='6') {
				max+=1;
			}else if(s.charAt(i)!='6'&&i!=s.length()-1){
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(j)=='6') {
						list.add(max);
						max=0;
						break;
					}
				}
			}
		}
		list.add(max);
		System.out.println(Collections.max(list));
	}
}