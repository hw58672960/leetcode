/**
 * Created by dell-pc on 2017/1/25.
 */
public class StringtoInteger {
    public int myAtoi(String str) {
        if (str.length()==0 || str == null) {
            return 0;
        }
        str = str.trim();
        long sum = 0;
        int start = 0;
        char firstChar = str.charAt(0);
        int sign = 1;
        int length = str.length();
        if (firstChar == '+') {
            start++;
            sign = 1;
        } else if (firstChar == '-') {
            start++;
            sign = -1;
        }
        for (int i = start; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) (sign * sum);
            }
            sum = sum * 10 + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && (-1)*sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) (sign * sum);
    }
}
