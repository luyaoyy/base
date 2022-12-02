package wһЩ����;

public class W�ظ�Ԫ�ض��� {
	/**
     * �ɲ����ظ�Ԫ�صĶ��ֲ����㷨
     * ˼·��  
     *  1���ȶ��������±� �� left = 0 , right = arr.length -1;
     *  2����Ϊ����Ҳ��֪��Ҫѭ�����ٴΣ�����һ��whileѭ������ֹ����Ϊright>left
     *  3����Ϊ�Ƕ��ֲ��ң�����һ��mid = left + (right - left) / 2;��ֹ���ݹ������
     *  4����������if��䣬��� target == arr[mid], return mid;���Ǿ���Ķ��ֲ��ң�������Ҫ�������Ľ�
     *  4.1���Ľ���������㷨����Ϊ�������ظ�Ԫ�أ�������Ҫ���ص�һ������target���±ꣻ��Ϊ����Ҳ��֪��midǰ���м����ظ���Ԫ��
     * ���������Ҫһ��while(mid>=0)��ѭ����mid--,Ȼ��ȶ�arr[mid]��target��ֻҪ��һ������ֹ������
     *  5����� target < arr[mid] , right = mid - 1;
     *  6�����target > arr[mid] , left = mid + 1;
     * @param nums
     * @param target
     * @return
     */
    public static int binarySearch(int[] nums , int target){

        int left = 0;
        int right = nums.length - 1;

        while(left <= right ) {
            int mid = (left + (right - left) / 2);
            if( target == nums[mid] ) {
                while(mid >= 0) {
                    if(nums[mid] != target) {
                        break;
                    }
                    mid--;
                }
                if(mid <= -1 ) {
                    return 0;
                }
                return mid + 1;//�����һ�Σ����ص�ʱ����Ҫ�ټ�1
            }else if( target < nums[mid] ) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    	int[] A = new int[]{1, 5, 5, 5, 5, 5, 6, 7, 8, 9};
    	System.out.println(binarySearch(A, 5));
	}
}
