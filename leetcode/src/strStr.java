/**
 * Created by dell-pc on 2017/2/15.
 */
public class strStr {
    public int solution(String haystack, String needle) {
        int index = -1;
        int i = 0;
        boolean flag;
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        } else if (needle.length() == 0) {
            return 0;
        } else if (haystack.length() == 0 || needle.length() > haystack.length()) {
            return index;
        }
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                flag = true;
                if (needle.length() > 1 && i == haystack.length() - 1||(i+needle.length()>haystack.length())) {
                    return -1;
                }
                for (int j = i + 1; (j - i) < needle.length() && j < haystack.length(); j++) {
                    if (haystack.charAt(j) != needle.charAt(j - i)) {
                        flag = false;
                    }
                }
                if (flag) {
                    return i;
                }
            }
            i++;
        }
        return index;
    }
}
