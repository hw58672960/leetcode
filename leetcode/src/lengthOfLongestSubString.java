import java.util.HashMap;

/**
 * 意图找到最大的未重复的字符串
 */
public class lengthOfLongestSubString{
    public int solution(String s){
        int number = 0;
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer>hashMap=new HashMap<Character,Integer>();
        for(int i=0, j=0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                j=Math.max(j, hashMap.get(s.charAt(i))+1);
            }
            hashMap.put(s.charAt(i),i);
            number=Math.max(number,i-j+1);//为了防止一个单字的情况
        }
        return number;
    }
}