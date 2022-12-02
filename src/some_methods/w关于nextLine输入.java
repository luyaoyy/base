package w一些方法;
import java.util.*;
public class w关于nextLine输入 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
			list.add(sc.nextLine());
		System.out.println(list);//此方法输入错误 得到的不是输入的a个字符串
		//更正：
//		int a=sc.nextInt();
//		sc.nextLine();
//		for(int i=0;i<a;i++)
//			list.add(sc.nextLine());//在sc.nextInt()后在接着输入 sc.nextLine(); 得到正确结果
	}
}
