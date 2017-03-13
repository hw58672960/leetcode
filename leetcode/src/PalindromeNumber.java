import java.util.Scanner;

/**
 * Created by dell-pc on 2017/1/25.
 */
public class PalindromeNumber {
    public static boolean isPalidrome(int x){
        if(x<0){
            return false;
        }
        boolean result=true;
        String a=x+"";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                result=false;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        System.out.println(isPalidrome(x));
    }
}
