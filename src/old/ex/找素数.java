
public class ÕÒËØÊı {
	public static void main(String[] args) {
		boolean[] prim=new boolean[10000000];
		for(int i=2;i<prim.length;i++) {
			if(!prim[i]) {
				for(int j=2*i;j<prim.length;j+=i)
					prim[j]=true;
			}
		}
		int id=1;
		int[] a=new int[100003];
		for(int i=2;i<prim.length;i++) {
			if(id==100003)
				break;
			if(!prim[i]) {
				a[id++]=i;
			}
		}
		System.out.println(a[100002]);
	}
}
