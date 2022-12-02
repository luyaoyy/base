package w一些方法;

import java.util.Stack;
//来自:https://blog.csdn.net/weixin_44026997/article/details/104352797?utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~aggregatepage~first_rank_ecpm_v1~rank_v31_ecpm-1-104352797.pc_agg_new_rank&utm_term=%E5%8A%9B%E6%89%A3%E8%BE%93%E5%87%BA%E7%BB%99%E5%AE%9A%E6%95%B0%E7%AC%AC%E4%B8%80%E4%B8%AA%E6%AF%94%E4%BB%96%E5%A4%A7%E7%9A%84%E6%95%B0&spm=1000.2123.3001.4430
public class Wz第一个比其大的数 {
	public static int[] findMaxRight(int[] array) {
		if (array == null)
			return array;
		int size = array.length;
		int[] result = new int[size];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int index = 1;
		while (index < size) {
			if (!stack.isEmpty() && array[index] > array[stack.peek()]) {
				result[stack.pop()] = array[index];
			} else {
				stack.push(index);
				index++;
			}
		}
		while (!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 2, 5, 4, 3, 9, 7, 2, 5 };
		int[] res = findMaxRight(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
