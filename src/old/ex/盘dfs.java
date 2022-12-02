import java.util.Scanner;

public class ÅÌdfs {
	static int n,k;
	static boolean[] vis;
	static char[][] map;
	static int ans;
	public static void dfs(int x,int a) {
		if(a==k) {
			ans++;
			return;
		}
		for(int i=x;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]=='#'&&!vis[j]) {
					vis[j]=true;
					dfs(x+1,a+1);
					vis[j]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		map=new char[n][n];
		vis=new boolean[n];
		for(int i=0;i<n;i++) {
			String s=sc.next();
			map[i]=s.toCharArray();
		}
		dfs(0,0);
		System.out.println(ans);
	}
}
