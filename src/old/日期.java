import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class 日期 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		long s=sdf.parse("1777-4-30").getTime();
		Date d=new Date((long)(8112)*(long)(86400000)+s);//第100天 实际天数为99 从1开始，求秒数要转换成long运算不然错误
		System.out.println(sdf.format(d));
	}
}
