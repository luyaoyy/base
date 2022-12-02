import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class W�Ǳ� {
	public static final int MAX = 60;
	public static int R, C;// �Ǳ����к���
	public static int rooms[][] = new int[MAX][MAX];// ��Ŵ���ÿ�����������
	public static int color[][] = new int[MAX][MAX];// ÿ������Ⱦ����ɫ��0��ʾû��Ⱦɫ
	// ��󷿼��������ɫ���(ͬ�ŵ���ͬһ������)����ǰ����Ⱦɫ�ķ�������
	public static int maxRoomArea = 0, colorNum = 0, roomArea;

	public static void dfs(int i, int k) {
		// �ӷ���(i,k)��������Ⱦɫ
		if (color[i][k] != 0) {
			return;
		}
		++roomArea;// �ߵ�һ���µ�δȾɫ���飬��ǰ�������Ҫ��1
		color[i][k] = colorNum;// ������(i,k)Ⱦɫ
		if ((rooms[i][k] & 1) == 0)
			dfs(i, k - 1);// ������
		if ((rooms[i][k] & 2) == 0)
			dfs(i - 1, k);// ������
		if ((rooms[i][k] & 4) == 0)
			dfs(i, k + 1);// ������
		if ((rooms[i][k] & 8) == 0)
			dfs(i + 1, k);// ������
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] split;
		R = sc.nextInt();
		C = sc.nextInt();
		str = sc.nextLine();// ��Ŀ������������һ�£���������
		for (int i = 1; i <= R; i++) {
			str = sc.nextLine().trim();// ����ĩ�ո�ȥ��
			split = str.split("\\s+");// ��һ�������ո����������
			for (int k = 1; k <= C; ++k) {
				rooms[i][k] = Integer.parseInt(split[k - 1]);
			}
		}
		for (int i = 1; i <= R; i++) {
			// Ѱ��һ��δȾɫ�ķ�����Ϊ�·�����㿪ʼȾɫ
			for (int k = 1; k <= C; k++) {
				// �ҵ�һ���µ���㣬�����ҵ�һ���·���
				if (color[i][k] == 0) {
					++colorNum;// ��һ����ɫ���
					roomArea = 0;
					dfs(i, k);
					maxRoomArea = Math.max(maxRoomArea, roomArea);
				}
			}
		}
		System.out.println(colorNum);// ��ɫ����������Ƿ������
		System.out.println(maxRoomArea);
	}
}
