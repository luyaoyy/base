package vjudge;
import java.util.*;
public class rails {
	public static boolean pd(int[] arr){
		int i,j,n=arr.length;
		int[] a=new int[n];
		Stack<Integer> st=new Stack<Integer>();
		for(i=0;i<n;i++)
			a[i]=i+1;
		i=0;j=0;
		while(i<n&&j<n) {
			if(st.empty()||(st.peek()!=arr[j])) {
				st.push(a[i]);
				i++;
			}
			else {
				st.pop();
				j++;
			}
		}
		while(!st.empty()&&st.peek()==arr[j]) {
			st.pop();
			j++;
		}
		if(j==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			int n=s.nextInt();
			if(n==0)
				break;
			else {
				while(s.hasNext()) {
					int[] arr=new int[n];
					arr[0]=s.nextInt();
					if(arr[0]==0) {
						System.out.println();
						break;
					}
					for(int i=1;i<n;i++)
						arr[i]=s.nextInt();
					if(pd(arr))
						System.out.println("Yes");
					else
						System.out.println("No");
				}
			}
		}
		
	}
}
