package w一些方法;
public class w指定位置插入字符串 {
	public static void main(String[] args) {
		StringBuffer str =new StringBuffer("asdasd");
		str=str.insert(2, "syyy");//第4个位置开始
		System.out.println(str);
	}
}
