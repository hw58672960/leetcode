import java.util.HashMap;

/**
 * Created by dell-pc on 2017/2/12.
 */
public class removeDuplicates {
    static int length = 0;

    public static int removeDuplicates(int[] nums) {
//        int length = 0;
        int j = 0;
        if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }
        if (nums.length == 2 && nums[0] == nums[1]) {
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String args[]) {
        int[] nums = {2,2,3};
        for (int i = 0; i <removeDuplicates(nums); i++) {
//            System.out.println("here");
            System.out.print(nums[i]+" ");
        }
    }
}
