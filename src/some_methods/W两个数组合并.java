package wһЩ����;

import java.util.Arrays;

public class W��������ϲ� {
	public static void main(String[] args) {
		int[] a1= {2,1,8,4,10,22};
		int[] a2= {2,14,3,0,15};
		int[] a3=new int[a1.length+a2.length];//���ڽ��ܽ��������
		System.arraycopy(a1, 0, a3, 0,a1.length);//��ߵ��ұߵĲ���������,1.Ҫ���Ƶ����� 2.Ҫ���������е�һ��Ԫ�ص���ʼλ��(������λ��) 3.���ɵ�����,���Ľ�� 4.Ҫ�������������ʼλ�õĸ��Ƴ���
		System.arraycopy(a2, 0, a3, a1.length, a2.length);
		Arrays.sort(a3);
		for(int i:a3)
			System.out.print(i+" ");
	}
}
