import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class ���� {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		long s=sdf.parse("1777-4-30").getTime();
		Date d=new Date((long)(8112)*(long)(86400000)+s);//��100�� ʵ������Ϊ99 ��1��ʼ��������Ҫת����long���㲻Ȼ����
		System.out.println(sdf.format(d));
	}
}
