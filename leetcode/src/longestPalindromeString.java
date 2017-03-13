/**
 * Created by Herz on 2017/1/28.
 * 借助了网上的方法
 */
public class longestPalindromeString {
    public static int lo;
    public static int maxLength;

    public static String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        for (int i = 0; i < s.length()-1; i++) {
            extendParlindrome(s, i, i);
            extendParlindrome(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLength);
    }

    public static int extendParlindrome(String s, int j, int k) {
        while (j >= 0 && s.charAt(j) == s.charAt(k) && k < s.length()) {
            j--;
            k++;
        }
        if (maxLength < k - j - 1) {
            maxLength = k - j - 1;
            lo = j + 1;
        }
        return maxLength;
    }

    public static void main(String args[]) {
        String s = "abc";
        System.out.println(longestPalindrome(s));
    }
}
