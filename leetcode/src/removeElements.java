/**
 * Created by dell-pc on 2017/2/14.
 * 打星子，重开了一个标记数组的变量
 */
public class removeElements {
    public static int solution(int[] nums, int k) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != k) {
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }

    public static void main(String args[]) {
        int[] nums = {2, 4, 5, 6};
        System.out.println(solution(nums, 2));
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }
//        for(int i=0;i<solution(nums,2);i++){
//            System.out.println(nums[i]+" ");
//        }
    }
}
