/**
 * Created by dell-pc on 2017/3/15.
 */
public class maxSubArray {
    public int solution(int[] a) {
        return divide(a, 0, a.length - 1);
    }

    public int divide(int[] a, int low, int high) {
        if (low == high) {
            return a[low];
        }
        if (low == high - 1) {
            return Math.max(a[low]+a[high], Math.max(a[high], a[low]));
        }
        int mid = (low + high) / 2;
        int lmax = divide(a, low, mid - 1);
        int rmax = divide(a, mid + 1, high);

        int mmax = a[mid];
        int tmp = mmax;
        for (int i = mid-1; i >=low; i++) {//因为子序列是连续的
            tmp += a[i];
            if (tmp > mmax) {
                mmax = tmp;
            }
        }
        tmp = mmax;
        for (int i = mid + 1; i <= high; i++) {
            tmp += a[i];
            if (tmp > mmax) {
                mmax = tmp;
            }
        }
        return Math.max(mmax,Math.max(lmax,rmax));
    }
}