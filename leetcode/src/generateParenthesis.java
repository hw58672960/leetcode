import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell-pc on 2017/2/11.
 */
public class generateParenthesis {
    public static List<String> solution(int n) {
        List<String> result = new ArrayList<String>();
        backtracking(result,"",0,0,n);
        return result;
    }

    public static void backtracking(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);

            return;
        }
        if (open < max) {

            backtracking(list, str+"(", open + 1, close, max);
        }
        if (close < open) {

            backtracking(list, str+")", open, close + 1, max);
        }
    }
    public static void main(String []args){
//       System.out.println(solution(3)) ;
        solution(3);
    }
}
