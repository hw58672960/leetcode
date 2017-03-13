import java.util.Stack;

/**
 * Created by dell-pc on 2017/2/10.
 */
public class validParenthese {
    public boolean isValid(String s){
//        boolean flag=false;
        Stack<Character>result=new Stack<Character>();
//        return flag;
        for(char c:s.toCharArray()){
            if(c=='('){
                result.push(')');
            }
            else if(c=='{'){
                result.push('}');
            }
            else if(c=='['){
                result.push(']');
            }
            else if(result.isEmpty()||result.pop()!=c){
                return false;
            }
        }
        return result.isEmpty();
    }
}
