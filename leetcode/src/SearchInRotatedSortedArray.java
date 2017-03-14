/**
 * Created by dell-pc on 2017/3/14.
 */
public class SearchInRotatedSortedArray {
    public int solution(int[] A, int target) {
        int index = -1;
        if (A.length == 0) {
            return -1;
        }
        if (A.length == 1) {
            return A[0] == target ? 0 : -1;
        }
        for (int i = 0; i < A.length; i++) {
            if(target==A[i]){
                index=i;
                break;
            }
        }
        return index;
    }
}
