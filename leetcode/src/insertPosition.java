/**
 * Created by dell-pc on 2017/3/6.
 */
public class insertPosition {
    public static int solution(int[] nums, int target) {
        int result = 0;
        if (target <= nums[0]) {
            return result;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i <=nums.length - 1; i++) {
            if(target<=nums[i]){
                result=i;
                break;
            }
        }
        return result;
    }
    public static void main(String []args){
        int nums[]={1,3};
//        System.out.println(solution(nums,5));
//        System.out.println(solution(nums,2));
//        System.out.println(solution(nums,7));
        System.out.println(solution(nums,2));
    }
}
