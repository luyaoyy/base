package w一些方法;

public class w数组右移 {
	//右移动一
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int last=a[4];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=last;
		for(int i:a)
			System.out.print(i + " "); 
		System.out.println();
		// 左移动一
		int[] b= {1,2,3,4,5};
		last=b[0];
		for(int i=0;i<b.length-1;i++) {
			b[i]=b[i+1];
		}
		b[4]=last;
		for(int i:b)
			System.out.print(i+" ");
	}

}
