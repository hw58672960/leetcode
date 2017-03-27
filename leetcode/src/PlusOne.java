/**
 * Created by dell-pc on 2017/3/23.
 */

public class PlusOne {
    public static int[] solution(int[] digits) {
        boolean carryFlag = false;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] >= 10) {
                carryFlag = true;
            }
            if (carryFlag) {
                digits[i] -= 10;
                digits[i - 1]++;
                carryFlag = false;
            } else {
                break;
            }
        }
        if (digits[0] >= 10) {
            digits[0]-=10;
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int []a=new int[]{9,9};
        System.out.println(solution(a));
    }
}
