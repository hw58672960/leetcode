/*
  Created by dell-pc on 2017/2/6.
 */
public class RomanToInt {
    public int solution(String s) {
        int number = toNumber(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (toNumber(s.charAt(i - 1)) < toNumber(s.charAt(i))) {
                number += toNumber(s.charAt(i)) - toNumber(s.charAt(i - 1)) * 2;
            } else {
                number += toNumber(s.charAt(i));
            }
        }
        return number;
    }

    public int toNumber(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'X':
                return 10;
            case 'C':
                return 100;
            case 'M':
                return 1000;
            case 'V':
                return 5;
            case 'L':
                return 50;
            case 'D':
                return 500;
        }
        return 0;
    }
}
