package vjudge;
	import java.util.Scanner;
public class shaifa {
		public static void main(String[] args) {
			int n;
			Scanner cin = new Scanner(System.in);
			while (cin.hasNextInt()) {
				n = cin.nextInt();
				int[] array = new int[n];
				for (int i = 2; i < n; i++) {
					if (array[i] == 0) {
						int j;
						for (j = 2 * i; j < n; j = j + i) {
							array[j] = 1;
						}
					}
				}
				for(int i=2;i<n;i++) {
					if(array[i]==0)
						System.out.print(i+"\t");
				}
			}
		}
	}
