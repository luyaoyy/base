package wһЩ����;

import java.util.Scanner;

public class wɸ�� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] Notprime=new boolean[n+1];//  Notprime[i] ����:��ʾ ��i�ǲ�������  true��ʾ�������� false ��ʾ������
		Notprime[0]=true;//0 1�������� 
		Notprime[1]=true;
		int cnt=0;
		for(int i=2;i<=n;i++) {//��2��ʼɸ��
			if(!Notprime[i]) {//  !isprime[i]=true��ʾi������  ��ô����2�� 3�� 4���������������� ��Ϊtrue
				for(int j=2*i;j<=n;j+=i) {//һ������������������ı�������n�ķ�Χ�ڣ��Ͳ�������
					Notprime[j]=true;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {//ͳ����������
			if(!Notprime[i])
				cnt+=1;
		}
		System.out.println(cnt);//�����������
	}
}
