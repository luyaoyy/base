package wһЩ����;

import java.util.*;

public class w�Ƚ�����д {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(8);
		list.add(8);
		list.add(4);
//return o1>o2?-1:1 ����
//return o1>o2?1,-1 ���� 
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// ������ôд�����������
				/* ����������˳��ͷ���-1������˳��ͷ���1��ʲô�������ͷ���0������ ����Ļ� ���o1<o2���ͷ���-1�� */
				// if (o1 < o2 ) {
				// return -1;
				// }else if (o1 > o2) {
				// return 1;
				// }
				// return 0;
				// ������ôд������ǽ���
				/* ����������˳��ͷ���-1������˳��ͷ���1��ʲô�������ͷ���0������ ����Ļ� ���o1<o2���ͷ���-1�� */
				if (o1 < o2) {
					return 0;
				} else if (o1 > o2) {
					return -1;
				}
				return 0;
			}
		});

		System.out.println(list);
	}
}
