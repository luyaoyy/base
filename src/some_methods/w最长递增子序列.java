package wһЩ����;

public class w����������� {
	public static void main(String[] args) {
		int[] arr = { 6, 6, 5, 2, 6, 6, 7, 6 }, a = new int[arr.length];
//		for (int i = arr.length-1; i >= 0; i--) {
//			a[i] = 1;
//			for (int j = arr.length-1; j > i; j--) {
//				if (arr[i] > arr[j]) {
//					a[i] = Math.max(a[i], a[j] + 1);
//				}
//			}
//		}		int[] arr = { 186, 186, 150, 200, 160, 130, 197, 220 }, a = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = arr.length-1; j > i; j--) {
				if ( 6== arr[j]) {
					a[i] += 1;
				}else {
					arr[i]=0;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
