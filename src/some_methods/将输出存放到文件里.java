package w一些方法;
import java.io.FileWriter;
import java.io.*;
import java.math.*;
public class 将输出存放到文件里 {
 
	public static void main(String[] args)throws Exception {
		FileWriter fw=new FileWriter(new File("D:\\\\sss.txt"));
		BufferedWriter bf=new BufferedWriter(fw);
		BigInteger a=new BigInteger("2");
		BigInteger b=new BigInteger("3");
		BigInteger ta=new BigInteger("2");
		BigInteger tb=new BigInteger("3");
		int t=1;
		while(t++<123456)
		{
			BigInteger xa=ta;
			ta=(xa.multiply(a)).subtract(tb.multiply(b));
			tb=(xa.multiply(b)).add(tb.multiply(a));
		}
		if(tb.signum()==1)
			bf.write(ta+"+"+tb+"i");
		else
			bf.write(ta+""+tb+"i");
		bf.close();
	}
}

