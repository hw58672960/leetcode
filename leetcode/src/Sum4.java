import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序进行相重性判断
 * lo hi
 */
public class Sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (nums.length < 4) {
            return result;
        }
        int L = nums.length;
        for (int i = 0; i < L - 3; i++) {
            if (nums[i] << 2 > target) return result;
            for (int j = L - 1; j > i + 2; j--) {
                if (nums[j] << 2 < target) break;
                int lo = i + 1, hi = j - 1;
                int rest = target - nums[i] - nums[j];
                while (lo < hi) {
                    int compare = nums[lo] + nums[hi];
                    if (rest == compare) {
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi], nums[j]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) {
                            lo++;
                        }//预防连着几个都是重的
                        while (lo < hi && nums[hi] == nums[hi - 1]) {
                            hi--;
                        }
                        lo++;
                        hi--;
                    } else if (compare < rest) {
                        lo++;
                    } else if (compare > rest) {
                        hi--;
                    }
                }
                while (j >= 1 && nums[j] == nums[j - 1]) {
                    j--;
                }
            }
            while (i <= nums.length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }
}
