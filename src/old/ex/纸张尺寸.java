import java.util.Scanner;
class Paper{
	int c,k;
	public Paper(int c,int k) {
		this.c=c;
		this.k=k;
	}
	public Paper() {
		
	}
}
public class ж╫уеЁъ╢Г {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Paper[] arr=new Paper[10];
		for(int i=0;i<10;i++)
			arr[i]=new Paper();
		arr[0]=new Paper(1189,841);
		for(int i=1;i<10;i++) {
			int cc=arr[i-1].c;
			int kk=arr[i-1].k;
			cc/=2;
			arr[i]=new Paper(Math.max(cc, kk),Math.min(cc, kk));
		}
		String s=sc.next();
		System.out.println(arr[s.charAt(1)-48].c);
		System.out.println(arr[s.charAt(1)-48].k);
	}
}
