/**
  Created by dell-pc on 2017/2/6.
 */
public class longestCommonPrefix {
    public String solution(String[] strs) {
        if(strs.length==0||strs==null){
            return "";
        }
        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length()-1);//因为尾端就是length-1
                //并且substring就是endIndex-1的
            }
        }
        return commonPrefix;
    }
}
