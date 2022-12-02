import java.util.Scanner;

public class W×îºÃµÄ²Ý {
	static int C,R;
	static char[][] map;
	static boolean[][] vis;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int sum;
	public static void dfs(int x,int y) {
		if(map[x][y]=='.'||vis[x][y]) 
			return;
		vis[x][y]=true;
		for(int i=0;i<4;i++) {
			int xx=x+dx[i],yy=y+dy[i];
			if(xx<0||xx>=C||yy<0||yy>=R)
				continue;
			dfs(xx,yy);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		C=sc.nextInt();
		R=sc.nextInt();
		map=new char[C][R];
		vis=new boolean[C][R];
		for(int i=0;i<C;i++) {
			String s=sc.next();
			for(int j=0;j<R;j++) 
				map[i][j]=s.charAt(j);
		}
		sum=0;
		for(int i=0;i<C;i++) {
			for(int j=0;j<R;j++) {
				if(map[i][j]=='#'&&!vis[i][j]) {
					sum++;
					dfs(i,j);
				}
			}
		}
		System.out.println(sum);
	}
}
