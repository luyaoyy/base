
import java.util.Scanner;

public class Ô¼Éª·ò»· {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int id=0;
		for(int i=2;i<=n;i++) {
			id=(id+k)%i;
		}
		System.out.println(id+1);
	}
}
