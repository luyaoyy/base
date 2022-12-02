package vjudge7;
import java.util.Scanner;
class Node {
	int w,v;
	public Node(int w,int v) {
		this.w=w;
		this.v=v;
	}
}
public class w03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		Node[] node=new Node[N+1];
		for(int i=1;i<=N;i++) {
			Node n=new Node(sc.nextInt(),sc.nextInt());
			node[i]=n;
		}
		int dp[]=new int[M+1];
		for(int i=1;i<=N;i++) {
			for(int j=M;j>=0;j--) {
				if(j>=node[i].w)
					dp[j]=Math.max(dp[j], dp[j-node[i].w]+node[i].v);
			}
		}
		System.out.println(dp[M]);
	}
}