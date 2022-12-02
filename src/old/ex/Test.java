
public class Test {

	public Test() {
		int sum = 0;
		int a = 1;
		for (int i = 1; i <= 60; i++) {// 取60位
			int count = 0;
			a = 1;// 每次都从1开始找，避免漏数

			// 因为是包含关系，约数个数大于等于都符合要求
			while (count < i) {
				count = 0;// 记录当前a的约数个数
				for (int j = 1; j <= a; j++) {
					if (a % j == 0)
						count++;
				}
				a++;
			}
			if (count >= i) {
				// 因为在循环结束后a多加了个1，这里减去
				sum += (a - 1);
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		new Test();

	}
}