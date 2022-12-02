package w一些方法;

import java.util.*;

public class w比较器重写 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(8);
		list.add(8);
		list.add(4);
//return o1>o2?-1:1 降序
//return o1>o2?1,-1 升序 
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// 下面这么写，结果是升序
				/* 如果保持这个顺序就返回-1，交换顺序就返回1，什么都不做就返回0；所以 升序的话 如果o1<o2，就返回-1。 */
				// if (o1 < o2 ) {
				// return -1;
				// }else if (o1 > o2) {
				// return 1;
				// }
				// return 0;
				// 下面这么写，结果是降序
				/* 如果保持这个顺序就返回-1，交换顺序就返回1，什么都不做就返回0；所以 升序的话 如果o1<o2，就返回-1。 */
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
