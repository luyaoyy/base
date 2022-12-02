import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ÅÅÐò×ÖÄ¸ {
	static Comparator<String> c=new Comparator<>() {

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
		
	};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String[] arr=s.split("");
		Arrays.sort(arr,c);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
}
