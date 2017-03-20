/**
 * Created by dell-pc on 2017/3/20.
 */
public class lengthOfLastWord {
    public static int solution(String s) {
      return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }

    public static void main(String[] args) {
        System.out.println(solution(" "));
    }
}
