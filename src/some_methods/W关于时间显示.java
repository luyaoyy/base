package wһЩ����;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//���ű� http://lx.lanqiao.cn/problem.page?gpid=T2909
//�Լ� https://blog.csdn.net/qq_31391283/article/details/85013861

//hh��12Сʱ��  HH��24Сʱ��
public class W����ʱ����ʾ {
	//�������ɺ���ת���ڸ�ʽ
	public static void main(String[] args) {            //  ϰ��� ʮ����ϰ�ܲ�����
		Scanner sc=new Scanner(System.in);
		long s=sc.nextLong()-28800000;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date(s);
		System.out.println(sdf.format(date).substring(11,19));
	}
}
//һ������ʱ���ʽת������ת�������� ��õĺ���Ĭ�Ͼ���1970-01-01 08:00:00
//public static void main(String[] args) throws Exception {
//	System.out.println("������������ͬ����,ÿ����һ�������밴�س�:");
//	Scanner s=new Scanner(System.in);
//	String da1=s.next();
//	String da2=s.next();
//	SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
//	long min1=d.parse(da1).getTime();//������ת����
//	long min2=d.parse(da2).getTime();
//	System.out.println(min1<min2?da1:da2+"��ǰ��");
//	long day=((min1>min2?min1:min2)-(min1<min2?min1:min2))/86400000;
//	//���ĺ������һ��ĺ�����
//	long mon=day/7;//��������7������
//	System.out.println("�������������"+day+"��"+","+mon+"��");
//}


//�����Ǹ��ݺ��������ǰ�����ڼ�
//Date date = new Date(100000000);
//SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
//String currSun = dateFm.format(date);
//System.out.println(currSun);
