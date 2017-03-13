/**
 * Created by dell-pc on 2017/1/7.
 */
public class Two_Sum_original {
    public static int[] solution(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i=0;i<numbers.length;i++){
            result[0]=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    result[1]=j;
                    System.out.println(result[0]+" "+result[1]);
                    return result;
                }
            }
        }
        return null;
    }
    public static void main(String []args){
        int []numbers=new int[]{3,2,4};
        int target=6;
        solution(numbers,target);

    }
}
