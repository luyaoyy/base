package w一些方法;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//蓝桥杯 http://lx.lanqiao.cn/problem.page?gpid=T2909
//以及 https://blog.csdn.net/qq_31391283/article/details/85013861

//hh是12小时制  HH是24小时制
public class W关于时间显示 {
	//以下是由毫秒转日期格式
	public static void main(String[] args) {            //  习题见 十届练习跑步锻炼
		Scanner sc=new Scanner(System.in);
		long s=sc.nextLong()-28800000;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date(s);
		System.out.println(sdf.format(date).substring(11,19));
	}
}
//一下是由时间格式转毫秒在转换成天数 获得的毫秒默认距离1970-01-01 08:00:00
//public static void main(String[] args) throws Exception {
//	System.out.println("请输入两个不同日期,每输入一个日期请按回车:");
//	Scanner s=new Scanner(System.in);
//	String da1=s.next();
//	String da2=s.next();
//	SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
//	long min1=d.parse(da1).getTime();//把日期转毫秒
//	long min2=d.parse(da2).getTime();
//	System.out.println(min1<min2?da1:da2+"在前面");
//	long day=((min1>min2?min1:min2)-(min1<min2?min1:min2))/86400000;
//	//相差的毫秒除于一天的毫秒数
//	long mon=day/7;//天数除于7是周数
//	System.out.println("这两个日期相差"+day+"天"+","+mon+"周");
//}


//以下是根据毫秒输出当前是星期几
//Date date = new Date(100000000);
//SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
//String currSun = dateFm.format(date);
//System.out.println(currSun);
