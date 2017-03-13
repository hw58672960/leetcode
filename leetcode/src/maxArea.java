/**
 * Created by dell-pc on 2017/2/5.
 */
public class maxArea {
    /*public static int solution(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area;
                if (height[i] == 0 || height[j] == 0) {
                    area = 0;
                } else {
                    area = (j - i) * Math.min(height[i],height[j]);
                }
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }*/
    public static int solution(int[] height) {
        int maxArea = 0, i = 0, j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {0, 2};
        System.out.println(solution(height));
    }
}
