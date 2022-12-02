package w一些方法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class W读数 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(str);
		String[] s = br.readLine().split(" ");
	}
}
