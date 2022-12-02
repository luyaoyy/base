package vjudge3;

import java.util.Scanner;

public class baiqian {
	public static void main(String[] args) {
		for(int i=0;i<=20;i++) {
			for(int j=0;j<34;j++) {
				for(int m=0;m<=300;m+=1) {
					if(i*5+j*3+(m/3.0)==100&&(i+j+m==100)) {
						System.out.println(i+" "+j+" "+m);
					}
				}
			}
		}
	}
}
