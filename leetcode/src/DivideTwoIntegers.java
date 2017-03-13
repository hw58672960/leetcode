/**
 * Created by dell-pc on 2017/2/27.
 */
public class DivideTwoIntegers {
    public static int solution(int dividend, int divisor) {
        int tag = 1;
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            int result = dividend * (-1);
            return result;
        }
        if (dividend >= 0 && divisor <= 0 || dividend <= 0 && divisor >= 0) {
            tag = -1;
        }
        long end = Math.abs((long) dividend);
        long sor = Math.abs((long) divisor);
        if (end < sor) {
            return 0;
        }
        int ret = 0;
        while (end >= sor) {
            int temp = 1;
            long bt = sor;
            while (end >= bt * 2) {
                temp = temp * 2;
                bt = bt * 2;
            }
            end -= bt;
            ret += temp;//否则就是0*2
        }
        return ret * tag;
    }

    public static void main(String args[]) {
        System.out.println(solution(-2147483648, -1));
    }
}
