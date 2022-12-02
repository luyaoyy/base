package vjudge5;

public class W二分细节 {
//在查询元素是否包含时，max=mid-1 min=mid+1, 结束条件while(mid<=max)或者while(mid+1<=max) 要等号
//已知不包含但查接近的  结束条件while(mid+1<max) 不要等号 且该结束条件中max=mid min=mid
}

//
//public int search(int[] nums, int target) {
//        if (nums == null || nums.length == 0) return -1;
//        int left = 0;
//        int right = nums.length - 1;
//        while (left + 1 < right) {
//            int mid = left + (right - left + 1) / 2;
//            if (target < nums[mid])
//                right = mid;
//            else
//                left = mid;
//        }
//        // 循环结束后：left + 1 == right
//        // 需要后处理，因为在循环中，还有两个个元素没有处理
//        if (nums[left] == target) return left;
//        if (nums[right] == target) return right;
//        return -1;
//    }
