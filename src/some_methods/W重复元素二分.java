package w一些方法;

public class W重复元素二分 {
	/**
     * 可查找重复元素的二分查找算法
     * 思路：  
     *  1、先定义两个下标 ， left = 0 , right = arr.length -1;
     *  2、因为我们也不知道要循环多少次，定义一个while循环，终止条件为right>left
     *  3、因为是二分查找，定义一个mid = left + (right - left) / 2;防止数据过大溢出
     *  4、定义三个if语句，如果 target == arr[mid], return mid;这是经典的二分查找，我们需要在这做改进
     *  4.1、改进经典二分算法，因为可能有重复元素，我们需要返回第一个出现target的下标；因为我们也不知道mid前面有几个重复的元素
     * 因此我们需要一个while(mid>=0)的循环，mid--,然后比对arr[mid]和target，只要不一样就终止，返回
     *  5、如果 target < arr[mid] , right = mid - 1;
     *  6、如果target > arr[mid] , left = mid + 1;
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
                return mid + 1;//多减了一次，返回的时候需要再加1
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
