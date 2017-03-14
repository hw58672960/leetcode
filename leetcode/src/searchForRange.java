/**
 * Created by dell-pc on 2017/3/14.
 */
public class searchForRange {
    public int[] solution(int[] nums, int target) {
        int start = binarySearch(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, (binarySearch(nums, target + 1) - 1)};
    }

    public int binarySearch(int[] nums, int target) {//firstGreatEqual
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}//把nums 改成A 可以提速好多
