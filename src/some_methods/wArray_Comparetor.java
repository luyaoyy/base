package wһЩ����;

import java.util.Arrays;
import java.util.Comparator;

public class wArray_Comparetor {
	static Comparator<Integer> C=new Comparator<Integer>() {

		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
		
	};
	public static void main(String[] args) {
		Integer[] arr= {2,5,1,3,2,6};//����������Ҫ��Comparator <>���һ�� 
		Arrays.sort(arr,C);
		for(int i:arr)
			System.out.println(i);
	}
}
