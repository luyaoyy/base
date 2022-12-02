package w一些方法;

import java.util.Arrays;

public class W两个数组合并 {
	public static void main(String[] args) {
		int[] a1= {2,1,8,4,10,22};
		int[] a2= {2,14,3,0,15};
		int[] a3=new int[a1.length+a2.length];//用于接受结果的数组
		System.arraycopy(a1, 0, a3, 0,a1.length);//左边到右边的参数依次是,1.要复制的数组 2.要复制数组中第一个元素的起始位置(包含该位置) 3.生成的数组,最后的结果 4.要被复制数组从起始位置的复制长度
		System.arraycopy(a2, 0, a3, a1.length, a2.length);
		Arrays.sort(a3);
		for(int i:a3)
			System.out.print(i+" ");
	}
}
