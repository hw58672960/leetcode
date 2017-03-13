import java.util.Arrays;

/**
 created by Herz
 */
public class Sum3Closet {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result =Integer.MAX_VALUE;
        int resultl = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1;
            int hi = nums.length-1;
            int sum = target - nums[i];
            int temp;
            int diff;
            int suml;
            while (lo < hi) {
                temp = nums[lo] + nums[hi];
                diff = Math.abs(temp - sum);
                suml=temp+nums[i];
                if(suml<target){
                    if(diff<result){
                        result=diff;
                        resultl=suml;
                    }
                    lo++;
                }
                else if(suml>target){
                    if(diff<result){
                        result=diff;
                        resultl=suml;
                    }
                    hi--;
                }
                else if(suml==target){
                    result=diff;
                    resultl=suml;
                    break;
                }
                //System.out.println(result);
            }

        }
        return resultl;
    }
    public static void main(String []args){
        int[]nums={1,1,1,0};
        int target=100;
        System.out.println(threeSumClosest(nums,target));
    }
}