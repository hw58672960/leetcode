import java.util.HashMap;

/**
 * Created by dell-pc on 2017/1/7.
 */
public class Two_Sum_2 {
    public int[] twoSum(int[]numbers,int target){
        int [] result=new int[2];
        HashMap<Integer,Integer>hashMap=new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++){
            if(hashMap.containsKey(numbers[i])){
                result[0]=hashMap.get(numbers[i]);//通过Key来查询value
                result[1]=i;
                return result;
            }
            else{
                hashMap.put(target-numbers[i],i);
            }
        }
        return null;
    }
}
