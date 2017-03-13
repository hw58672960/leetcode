/**
 * Created by dell-pc on 2017/2/5.
 */
public class intToRoman {
    public static String solution(int num) {
        String s = "";
        int numsOfM = num / 1000;
        num -= numsOfM * 1000;
        for (int i = 0; i < numsOfM; i++) {
            s += "M";
        }
        int numsOfD = num / 500;
        num -= numsOfD * 500;
        for (int i = 0; i < numsOfD; i++) {
            s += "D";
        }
        int numsOfC = num / 100;
        num -= numsOfC * 100;
        if (numsOfC == 4) {
            if (numsOfD == 1) {
                s=s.substring(0,s.length()-1);
                s += "CM";
            } else {
                s += "CD";
            }
        } else {
            for (int i = 0; i < numsOfC; i++) {
                s += "C";
            }
        }
        int numsOfL = num / 50;
        num -= numsOfL * 50;
        for (int i = 0; i < numsOfL; i++) {
            s += "L";
        }
        int numsOfX = num / 10;
        num -= numsOfX * 10;
        if (numsOfX == 4) {
            if (numsOfL == 1) {
                s=s.substring(0,s.length()-1);
                s += "XC";
            } else {
                s += "XL";
            }
        } else {
            for (int i = 0; i < numsOfX; i++) {
                s += "X";
            }
        }
        switch (num) {
            case 1:
                s += "I";
                break;
            case 2:
                s += "II";
                break;
            case 3:
                s += "III";
                break;
            case 4:
                s += "IV";
                break;
            case 5:
                s += "V";
                break;
            case 6:
                s += "VI";
                break;
            case 7:
                s += "VII";
                break;
            case 8:
                s += "VIII";
                break;
            case 9:
                s += "IX";
                break;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(solution(90));
    }
}
